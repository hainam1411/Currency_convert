package org.example.currency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }



    @RequestMapping("/convert")
    public ModelAndView convert(@RequestParam("usd") double usd) {
        double vnd = usd * 23000;
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("vnd", vnd);
        modelAndView.addObject("usd", usd);
        return modelAndView;
    }
}
