package com.tg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String first(Model theModel) {
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "my-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        return "my-view";
    }
}
