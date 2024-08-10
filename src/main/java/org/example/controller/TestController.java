package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @GetMapping("/testPage")
    public ModelAndView testPage() {
        ModelAndView modelAndView = new ModelAndView("testPage");
        modelAndView.addObject("test", "Hello World fom test page");
        return modelAndView;
    }
}
