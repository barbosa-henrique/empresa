package br.mso.empresa.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //eesa anotation indica que ele vai carregar um template como retorno
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String nome(){
        return "home.html";
    }
}
