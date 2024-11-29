package com.mt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model) {
        // Add a "name" attribute to the model with the value "Hello World!"
        model.addAttribute("name", " Hello World!");
        return "home";  // Return the view name "home" to be rendered
    }

}
