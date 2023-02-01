package com.tg;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @InitBinder // pre-process all web requests coming into our Controller
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true); // remove leading and trailing white space (if string has only white space, trim it to null)
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor); // for every string class, apply the StringTrimmerEditor
    }

    @RequestMapping("/showForm")
    public String first(Model theModel) {
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "my-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult) {

        System.out.println("Binding result: " + theBindingResult);
        if (theBindingResult.hasErrors()) {
            return "my-form";
        }
        return "my-view";
    }
}