package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller //--marks this class as a spring mvc controller--//
@ResponseBody //--indicates return value of methods will be bound to web response body--//
@RequestMapping //--maps web requests to methods in this controller--//
public class SkillsController {
    @ResponseBody
    @GetMapping() //--maps http get requests to this method--//
    public String skillTracker() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>This is FUN!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }
    @GetMapping("/form") //--maps http get requests for "/form"--//
    public String displayForm() {
        return "<form action='/form' method='post'>" +
                "Name: <input type='text' name='name'><br>" +
                "My favorite language: <select name='favorite'><option>Java</option><option>JavaScript</option><option>Python</option></select><br>" +
                "My second favorite language: <select name='secondFavorite'><option>Java</option><option>JavaScript</option><option>Python</option></select><br>" +
                "My third favorite language: <select name='thirdFavorite'><option>Java</option><option>JavaScript</option><option>Python</option></select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>";
    }

    @PostMapping("/form") //--maps http post requests for "/form" url to this method--//
    public String processForm(@RequestParam String name, @RequestParam String favorite,
                              @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>";
    }


}