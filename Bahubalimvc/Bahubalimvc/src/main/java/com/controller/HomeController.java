package com.controller;

import com.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @ModelAttribute("countries")
    public List getCountryList() {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Pak");
        countries.add("china");
        return countries;
    }

    @RequestMapping
    public String home(Model model) {
        model.addAttribute("msg", "This is home page");
        return "home";
    }

    @ResponseBody
    @RequestMapping("/rest")
    public String restMethod() {
        //
        return "this is rest method";
    }

    @RequestMapping("/name")
    public String getName(Model model) {
        model.addAttribute("name", "Bahubali");
        return "product";
    }

    @RequestMapping("/addUser")
    public String addUser(Model model) {
        User user = new User();
        user.setEmail("xyz.com");
        model.addAttribute("user", user);
        return "userform";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute @Valid User user, BindingResult br, Model model) {
        if (br.hasErrors()) {
            model.addAttribute("msg", "There is error with form submit");
            return "userform";
        }
        System.out.println(user.getEmail());
        //TODO save above data in data base
        // call server method here
        model.addAttribute("user", new User());
        model.addAttribute("msg", "Data saved successfully!!");
        return "userform";
    }
}
