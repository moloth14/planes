package com.moloth.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/form")
public class SimpleFormController {

    @RequestMapping(method = RequestMethod.GET)
    public String mirrorGet(String name, String hiddenParameter, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("hiddenParameter", hiddenParameter);

        return "startPage";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String mirrorPost(String name, String hiddenParameter, Model model) {
        return mirrorGet(name, hiddenParameter, model);
    }
}
