package Domains;

import Interfaces.project;

public class Project implements project{
    private String name;
    private double price;
    public Project(){};
    public  Project(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    @Override
    public void startptoject() {
        System.out.println("We will be start our project");
        projectdone();
    }

    @Override
    public void projectdone() {
        System.out.println("Your project ready to use");
    }
}

