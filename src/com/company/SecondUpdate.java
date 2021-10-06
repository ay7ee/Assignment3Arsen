package com.company;

public class SecondUpdate extends UpdateDecorator{
    public SecondUpdate(UpdateCsGo update){
        super(update);
    }
   public String secondUpdate(){
        return "Second Update: New skins for agents were added. And fixed some bugs. \n";
   }

    @Override
    public String updateCsGo() {
        return super.updateCsGo() + secondUpdate();
    }
}
