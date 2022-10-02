package Beans;

import org.springframework.stereotype.Component;


public class Tyres {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void display(){
        System.out.println("I am "+name+" Tyres");
    }

    @Override
    public String toString() {
        return  name;
    }
}
