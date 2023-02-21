package be.thomasmore.partyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;
import java.util.Date;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model){
        int myCalculatedValue = 22 * 11;
        model.addAttribute("myCalculatedValue", myCalculatedValue);
        return "Home";
    }

    @GetMapping("/faq")
    public String faq(Model model){
        String naam="Quinten";
        String straat="Berthoustraat";
        int huisnummer=20;
        model.addAttribute("naam", naam);
        model.addAttribute("straat", straat);
        model.addAttribute("huisnummer", huisnummer);
        return "faq";
    }

    @GetMapping("/pay")
    public String pay(Model model){
        Calendar c = Calendar.getInstance();
        model.addAttribute("date", c.getTime().toString());
        return "pay";
    }


}
