package com.company;

public class Gamer {
    public static void main(String[] args) {
        UpdateCsGo updates = new FirstUpdate();
        UpdateCsGo updates2 =  new SecondUpdate( new FirstUpdate());
        UpdateCsGo updates3 = new ThirdUpdate(new SecondUpdate(new FirstUpdate()));
        System.out.println(updates3.updateCsGo());
    }
}
