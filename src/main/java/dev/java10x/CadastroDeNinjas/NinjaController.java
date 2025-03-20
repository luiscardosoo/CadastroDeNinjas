package dev.java10x.CadastroDeNinjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class NinjaController {

       @GetMapping("/boasVindas")
       public String boasVindas(){
           return "Boas vindas";
    }

}
