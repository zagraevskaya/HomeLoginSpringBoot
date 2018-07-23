package com.example.controller;

import com.example.model.ParamUsersEntity;
import com.example.repository.ParamUserRepository;
import com.example.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.service.UserService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RequestController {
    @Autowired
    private ParamService paramService;
    @Autowired
    private UserService userService;

    @RequestMapping(value="/admin/processRequestChangePass", method = RequestMethod.GET)
    public ModelAndView processRequestChangePass(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        modelAndView.addObject("user", user);
        modelAndView.setViewName("admin/processRequestChangePass");

        List<ParamUsersEntity> paramList=paramService.findByEmail(user.getEmail());

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
    public ModelAndView createNewRequestChagePass(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("/admin/processRequestChangePass");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("admin/processRequestChangePass");

        }

        return modelAndView;
    }
}
