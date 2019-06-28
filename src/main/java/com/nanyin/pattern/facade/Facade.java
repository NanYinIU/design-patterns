package com.nanyin.pattern.facade;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    List<Services> services;

    public Facade() {
        services = new ArrayList<>();
    }

    public void addService(Services services){
        this.services.add(services);
    }

    public void start(){
        for (Services services : this.services){
            services.start();
        }
    }

    public void stop(){
        for (Services services : this.services){
            services.stop();
        }
    }

    public void restart(){
        for (Services services : this.services){
            services.restart();
        }
    }
}
