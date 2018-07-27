package com.example.controller;

import com.example.model.ParamUsersEntity;
import com.example.model.WuRequest;
import com.example.model.User;

import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import javax.validation.Valid;
import java.util.List;

@Controller
public class RequestController {
    @Autowired
    private ParamService paramServiceImpl;
    @Autowired
    private UserService userServiceImpl;
    @Autowired
    private WuRequestService wuRequestService;


    @RequestMapping(value="/admin/processRequestChangePass", method = RequestMethod.GET)
    public ModelAndView processRequestChangePass(){
        ModelAndView modelAndView = new ModelAndView();

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userServiceImpl.findUserByEmail(auth.getName());
        modelAndView.addObject("user", user);

        WuRequest wuRequest=new WuRequest();
        modelAndView.addObject("wurequest",wuRequest);


        modelAndView.setViewName("admin/processRequestChangePass");

        List<ParamUsersEntity> paramList= paramServiceImpl.findByEmail(user.getEmail());

        for (ParamUsersEntity paramUsersEntity: paramList ){
            String nameAtribbute= paramUsersEntity.getNameParam();
            switch (nameAtribbute) {
              case "Attribute_1" :   modelAndView.addObject("Attribute_1", paramUsersEntity.getValueParam());
              case "Attribute_2" :   modelAndView.addObject("Attribute_2", paramUsersEntity.getValueParam());
              case "Attribute_3" :   modelAndView.addObject("Attribute_3", paramUsersEntity.getValueParam());
              case "Attribute_4" :   modelAndView.addObject("Attribute_4", paramUsersEntity.getValueParam());
              case "Attribute_5" :   modelAndView.addObject("Attribute_5", paramUsersEntity.getValueParam());
              case "Attribute_6" :   modelAndView.addObject("Attribute_6", paramUsersEntity.getValueParam());
          }
        }

        modelAndView.addObject("userName", " Персональні данні :  " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");


        return modelAndView;
    }


    @RequestMapping(value = "/admin/processRequestChangePass", method = RequestMethod.POST)
    public ModelAndView createNewRequestChagePass(@Valid WuRequest wuRequest, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();

        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("/admin/processRequestChangePass");
        } else {
            wuRequestService.saveWuRequest(wuRequest);
            modelAndView.addObject("successMessage", "Заявка отправлена успешо");
            modelAndView.addObject("wuRequestEntity", new WuRequest());
            modelAndView.setViewName("admin/processRequestChangePass");

        }

        return modelAndView;
    }
}
