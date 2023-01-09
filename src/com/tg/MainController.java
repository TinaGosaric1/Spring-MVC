package com.tg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String firstMethod() {
        return "main-page";
    }

    // method to show the initial HTML form
    @RequestMapping("/showForm")
    public String secondMethod() {
        return "my-form1";
    }

    // method to process the HTML form
    @RequestMapping("/processForm")
    public String thirdMethod() {
        return "my-form2";
    }

}
