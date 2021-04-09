package com.example.Spring_Boot_ASS1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
//@RestController
public class SpringBootAss1Application {
    String userName;


    public static void main(String[] args) {
        SpringApplication.run(SpringBootAss1Application.class, args);


    }

    @GetMapping("/Welcome")

    public String Welcome(Model model) {


        return String.format("Nice to meet you ready to start?");

    }

    @GetMapping("/welcome")
    public String showGreeting(Model model) {
        String[] greet = {"Nice to meet you,36++ ready to start?", "this is unnecessary", "but you gotta learn somehow"};
        model.addAttribute("greeting", greet);


        return "welcome";
    }

    @GetMapping("/users")

    public String goUsers(Model model) {
        String[] members = {"joe", "sal", "king kong"};
        model.addAttribute("newUsers", members);

        return "users";
    }

    @GetMapping("/meNombre")
    public String name(Model model) {
        String jeff = "myNameJEFF";
        model.addAttribute("meNombre", jeff);
        return "meNombre";

    }

    /*@PostMapping("/saveUserName")
    public String saveUserName(@RequestParam String name ) {


         userName =name;


        return "user";

    }

    @GetMapping("/display")
    public String getUserName(Model model) {

        model.addAttribute("userName",userName);
        return "display";
    }*/


}
