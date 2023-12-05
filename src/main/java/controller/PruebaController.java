package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PruebaController {
    @RequestMapping("/index")
    public String prueba() {
        return "index";
    }
}
