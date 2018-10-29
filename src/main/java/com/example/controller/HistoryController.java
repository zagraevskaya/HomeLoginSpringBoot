package com.example.controller;


import com.example.model.WuRequest;
import com.example.model.User;

import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



import javax.validation.Valid;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class HistoryController {
    @Autowired
    private UserService userService;
    @Autowired
    private WuRequestService wuRequestService;

    private String sortDateMethod = "ASC";

    //История заявок
    @RequestMapping(value = "/admin/history", method = RequestMethod.GET)
    public ModelAndView history(@RequestParam(required = false, defaultValue = "1") Integer page,
                                @RequestParam(required = false, defaultValue = "id") String sortBy,
                                @RequestParam(required = false, defaultValue = "ask") String order,
                                @RequestParam(required = false, defaultValue = "") String term, // запрос на поиск
                                @RequestParam(required = false, defaultValue = "0") int afterYear, // минимальный год выхода книги в печать
                                @RequestParam(required = false, defaultValue = "") int ready, Model uiModel) {

        //Создали модель
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/history");


        //Порядок сортировки
        Sort sort;
        if (order.equals("desc")) {
            sort = new Sort(Sort.Direction.DESC, sortBy);
        } else {
            sort = new Sort(Sort.Direction.ASC, sortBy);
        }

        //Нумерация страниц для Spring Data JPA начинается с 0
        Integer pageNumber = (page > 0) ? page - 1 : 0;
       // PageRequest pageRequest = new PageRequest(pageNumber, 2, sort);

        Sort idDOBSort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageRequest = new PageRequest(pageNumber, 10, Sort.Direction.ASC, "dateRequest");


        // Integer pageNumber = (page > 0) ? page - 1 : 0;
        // Pageable pageSort = new PageRequest(pageNumber, 5, Sort.Direction.DESC, "dateRequest");
        // Page<WuRequest> listWuRequest = wuRequestService.findByAmount("USD", pageSort);

       // Page<WuRequest> listWuRequest = wuRequestService.listWuRequest(pageRequest);

        Page<WuRequest> listWuRequest = wuRequestService.findByPrimaryState(ready,pageRequest);
        /*
        Page<WuRequest> listWuRequest;

        if (!ready.equals("") && (ready.equals("1") || ready.equals("2")))
            listWuRequest = wuRequestService.search(term, afterYear, Boolean.parseBoolean(ready), pageRequest);
        else
            listWuRequest = wuRequestService.search(term, afterYear, pageRequest);
       */

        modelAndView.addObject("listWuRequest", listWuRequest);
        modelAndView.addObject("current", pageNumber);
        modelAndView.addObject("term", term);
        modelAndView.addObject("year", afterYear);
        modelAndView.addObject("ready", ready);

        //List<WuRequest> acWuRequestList = filterAndSort();

        //if (acWuRequestList.size()>0) {
        //  modelAndView.addObject("listWuRequest", acWuRequestList);
        //} else  {
        //  modelAndView.addObject("listWuRequest", null);
        //}

        return modelAndView;
    }


    @GetMapping(path = "/search")
    public @ResponseBody
    Page<WuRequest> search(
            @RequestParam(required = false, defaultValue = "1") Integer page, //начальная страница, по умлчанию 1
            @RequestParam(required = false, defaultValue = "id") String sortBy, //поле сортировки списка, по умолчанию id
            @RequestParam(required = false, defaultValue = "ask") String order, // направление сортовки, по умолчанию - по возрастанию
            @RequestParam(required = false, defaultValue = "") String term, // запрос на поиск
            @RequestParam(required = false, defaultValue = "0") int afterYear, // минимальный год выхода книги в печать
            @RequestParam(required = false, defaultValue = "") String ready // прочитана или нет
    ) {
        Sort sort;
        if (order.equals("desc")) sort = new Sort(Sort.Direction.DESC, sortBy);
        else sort = new Sort(Sort.Direction.ASC, sortBy);

        //Нумерация страниц для Spring Data JPA начинается с 0
        Integer pageNumber = (page > 0) ? page - 1 : 0;
        PageRequest pageRequest = new PageRequest(pageNumber, 10, sort);

        if (!ready.equals("") && (ready.equals("1") || ready.equals("2"))) {
            return wuRequestService.search(term, afterYear, Boolean.parseBoolean(ready), pageRequest);
        }
        return wuRequestService.search(term, afterYear, pageRequest);
    }




    //Просмотр Заявки на изменение лимита
    @RequestMapping(value="/admin/processRequestLimit/{id}", method = RequestMethod.GET)
    public ModelAndView processRequestLimitUpdate(@PathVariable Integer id,Model uiModel){
        //Создали модель
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/processRequestLimit");
        WuRequest wuRequest=wuRequestService.findByWuId(id);
        modelAndView.addObject("wu_request",wuRequest);
        return modelAndView;
    }


    @GetMapping("/sort/{sortDate}")
    public ModelAndView sortChoose(@PathVariable String sortDate) {
        sortDateMethod = sortDate;

        //Создали модель
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/history");

        //Cортировка по дате
        List<WuRequest> acWuRequestList = filterAndSort();

        if (acWuRequestList.size()>0) {
            modelAndView.addObject("listWuRequest", acWuRequestList);
        } else  {
            modelAndView.addObject("listWuRequest", null);
        }
        return modelAndView;

    }

    //Сортировка по дате
    private List<WuRequest> filterAndSort() {
        //Получили юзера
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        List<WuRequest> wuRequest = new ArrayList<>();
        switch (sortDateMethod) {
            case "ASC":
                wuRequest = wuRequestService.findByNameOrderAbs(auth.getName());
                break;
            case "DESC":
                wuRequest = wuRequestService.findByNameOrderDesc(auth.getName());
                break;
        }
        return wuRequest;
    }



}
