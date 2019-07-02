package com.nanyin.pattern.command;

public class King {
    private Command command;

    public Command invoke(Command command){
        this.command = command;
        return this.command;
    }

    public void action(){
        command.excute();
    }

}
