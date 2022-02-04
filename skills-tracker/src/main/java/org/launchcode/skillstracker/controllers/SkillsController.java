package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skillsTracker() {
        return "<html> +" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.  Here is the list!</h2>" +
                "<ol type='1'>"+
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String blankForm() {
        return "<form method='post'>" +
                "Name:<br>" +
                "<input type = 'text' name = 'name' />" +
                "<br>My favorite language:<br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";
    }

    @PostMapping("form")
    public String results(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html> +" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol type='1'>"+
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }


}
