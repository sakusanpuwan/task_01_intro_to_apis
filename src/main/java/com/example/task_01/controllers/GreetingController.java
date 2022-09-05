package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping(value = "/string") //http://localhost:8080/greeting/string
    public String greeting1(){
            return "Good afternoon Sakusan!";
    }


    @GetMapping(value = "/name") // returns in JSON http://localhost:8080/greeting/name_greeting
    public Greet greeting2(){
        return new Greet("Sakusan","afternoon");
    }

    @GetMapping(value = "/pojo") //http://localhost:8080/greeting/pojo
    public String greeting3(){
        Greet newGreet = new Greet("Sakusan","afternoon");
        return "Good " + newGreet.getTimeOfDay() + " " + newGreet.getName() + "!";
    }


    @GetMapping(value = "/time") //http://localhost:8080/greeting/time?time=afternoon
    public String whatsTheTime(@RequestParam(value = "time") String time){
        return "It is the " + time;
    }

    @GetMapping(value = "/celebration") //http://localhost:8080/greeting/celebration
    public Celebration celebration(){
        return new Celebration("Merry Christmas!");
    }







}
