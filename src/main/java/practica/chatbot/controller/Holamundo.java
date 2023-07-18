package practica.chatbot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo {
    @GetMapping("/hola")
    public String holaMundo (){
        return "Hola Mundo";
    }

}
