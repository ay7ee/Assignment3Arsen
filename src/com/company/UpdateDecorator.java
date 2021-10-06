package com.company;

public class UpdateDecorator implements UpdateCsGo{
    UpdateCsGo update;
    public UpdateDecorator(UpdateCsGo update){
        this.update = update;
    }

    @Override
    public String updateCsGo() {
        return update.updateCsGo();
    }
}
