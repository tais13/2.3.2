package com.example.__04.lunes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class estudio {

     @GetMapping("/holaa")
     public String holaMundo(){
          return "hola papus";
     }
}
