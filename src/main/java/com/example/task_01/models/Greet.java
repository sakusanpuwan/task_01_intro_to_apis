package com.example.task_01.models;

public class Greet {

    private String name;
    private String timeOfDay;

    public Greet(String name,String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Greet(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
