package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/hwform")
    public String showForm(){
        return "helloworldform";
    }

    @RequestMapping("/processForm")
    public String letsShoutDude(HttpServletRequest httpServletRequest, Model model){

        String name = httpServletRequest.getParameter("studentName");

        name = "YO!" + name.toUpperCase();

        model.addAttribute("message", name);

        return "processForm";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(@RequestParam("studentName")String name, Model model){

        name = "YO!" + name.toUpperCase();

        model.addAttribute("message", name);

        return "processForm";
    }

}
