package com.tg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/")
    public String firstMethod() {
        return "main-page";
    }

    // method to show the initial HTML form
    @RequestMapping("/showForm")
    public String secondMethod() {
        return "my-form";
    }

    // method to read form data and add data to the model
    @RequestMapping("/processForm")
    public String thirdMethod(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "my-view";
    }
}
