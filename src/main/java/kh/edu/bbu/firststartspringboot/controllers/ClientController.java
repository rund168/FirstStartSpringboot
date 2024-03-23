package kh.edu.bbu.firststartspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
    /**
     * rule model of spring
     * controllers
     * models -> mapping to table in database
     * repository -> query
     * services -> login
     * flow
     * user -> click on browser
     * controllers
     * service
     * repository
     * model
     * */

}
