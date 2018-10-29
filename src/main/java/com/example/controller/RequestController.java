package com.example.controller;

import com.example.mail.HtmlRequestLimit;
import com.example.mail.SendMailIDoc;
import com.example.model.AcWuDictUserTermDiv;
import com.example.model.WuRequest;
import com.example.model.User;

import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RequestController {

    @Autowired
    private UserService userService;
    @Autowired
    private WuRequestService wuRequestService;
    @Autowired
    private AcWuDictUserService acWuDictUserService;

    private String sortDateMethod = "ASC";


    //Заявка на изменение лимита ПОЛУЧЕНИЕ ДАННЫХ
    @RequestMapping(value="/admin/processRequestLimit", method = RequestMethod.GET)
    public ModelAndView processRequestLimit(){

        //Создали модель
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/processRequestLimit");

        //Получили юзера
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        //Получили парамеры юзера для процессов WU
        AcWuDictUserTermDiv acWuDictUser=acWuDictUserService.findByEmail(auth.getName());

        if (acWuDictUser!=null) {
            modelAndView.addObject("terminal", acWuDictUser.getCodeTerminal());
            modelAndView.addObject("subAgent", "ACCORDBANK,Branch#" + acWuDictUser.getTt());
            modelAndView.addObject("codeOperator", acWuDictUser.getOperatorNo());
            modelAndView.addObject("fio", acWuDictUser.getOperatorFio());
            modelAndView.addObject("email", acWuDictUser.getOperatorEmail());
        } else {

            modelAndView.addObject("terminal", "");
            modelAndView.addObject("subAgent", "ACCORDBANK,Branch#");
            modelAndView.addObject("codeOperator", "");
            modelAndView.addObject("fio", "");
            modelAndView.addObject("email", "");


        }
        //Cоздали новую заявку
        WuRequest wu_request=new WuRequest();
        modelAndView.addObject("wu_request",wu_request);
        return modelAndView;
    }


    //Заявка на изменение лимита ОТПРАВКА ДАННЫХ
    @RequestMapping(value = "/admin/processRequestLimit", method = RequestMethod.POST)
    public ModelAndView createNewRequestLimit(@Valid @ModelAttribute("wu_request") WuRequest wuRequest, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        //Получили дату
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Calendar currentDate=Calendar.getInstance();
        Date date = new Date();

        //Получили юзера
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        //Получили парамеры юзера для процессов WU
        AcWuDictUserTermDiv acWuDictUser=acWuDictUserService.findByEmail(auth.getName());
        modelAndView.addObject("terminal", acWuDictUser.getCodeTerminal());
        modelAndView.addObject("subAgent", "ACCORDBANK,Branch#"+acWuDictUser.getTt());
        modelAndView.addObject("codeOperator", acWuDictUser.getOperatorNo());
        modelAndView.addObject("fio", acWuDictUser.getOperatorFio());
        modelAndView.addObject("email", acWuDictUser.getOperatorEmail());

        //Если форма не прошла валидацию
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("wu_request",wuRequest);
            modelAndView.setViewName("admin/processRequestLimit");
        }
        //при успешной валидации формируем письмо
        else {
            User user = userService.findUserByEmail(auth.getName());
            wuRequest.setEmail(auth.getName());
           // wuRequest.setUserId(user.getId());
            wuRequest.setPrimaryUser(user);
            wuRequest.setDateRequest(date);
            wuRequestService.saveWuRequest(wuRequest);
            modelAndView.addObject("wu_request", new WuRequest());
            //текст письма в формате HTML
            String textEmail=new HtmlRequestLimit().creatHtmlBodyMail(wuRequest, acWuDictUser);
            //отправка письма по адресу
            new SendMailIDoc("zagraevskaya@accordbank.com.ua").sendEmail(textEmail);

            modelAndView.setViewName("admin/sucessMessage");
        }
        return modelAndView;
    }


    @RequestMapping(value="/admin/processRequestChangePass", method = RequestMethod.GET)
    public ModelAndView processRequestChangePass(){
        //Создали модель
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/processRequestChangePass");

        //Получили юзера
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("user", user);

        //Получили парамеры юзера для процессов WU
        AcWuDictUserTermDiv acWuDictUser=acWuDictUserService.findByEmail(auth.getName());
        if (acWuDictUser!=null) {
            modelAndView.addObject("TT", acWuDictUser.getTt());
        }

        WuRequest wuRequest=new WuRequest();
        modelAndView.addObject("wurequest",wuRequest);
        modelAndView.addObject("userName", " Персональні данні :  " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");


        return modelAndView;
    }


    @RequestMapping(value = "/admin/processRequestChangePass", method = RequestMethod.POST)
    public ModelAndView createNewRequestChagePass(@Valid WuRequest wuRequest, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();

        if (bindingResult.hasErrors()) {

            modelAndView.setViewName("/admin/processRequestChangePass");
        } else {
            wuRequest.setEmail("test@gmail.com");
           // wuRequest.setUserId(111);

            wuRequestService.saveWuRequest(wuRequest);
            modelAndView.addObject("successMessage", "Заявка отправлена успешо");
            modelAndView.addObject("wuRequest", new WuRequest());
            modelAndView.setViewName("admin/processRequestChangePass");

        }

        return modelAndView;
    }


}
