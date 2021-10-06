package com.company;

public class ThirdUpdate extends UpdateDecorator{
    public ThirdUpdate(UpdateCsGo update){
        super(update);
    }
    public String ThirdUpdate(){
        return "Third Update: New map was added. Deagle was nerfed. New operation was added. \n";
    }

    @Override
    public String updateCsGo() {
        return super.updateCsGo() + ThirdUpdate();
    }
}
