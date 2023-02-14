package be.thomasmore.partyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(){
        return "Home";
    }

    @GetMapping("/faq")
    public String faq(){
        return "faq";
    }


}
