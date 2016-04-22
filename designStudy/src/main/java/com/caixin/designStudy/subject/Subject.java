package com.caixin.designStudy.subject;

import java.util.ArrayList;
import java.util.List;

import com.caixin.designStudy.subject.service.Observer;

public abstract class Subject {

    private List<Observer> list = new ArrayList<>();
    
    public void attach(Observer observer){
        list.add(observer);
        System.out.println("attach an observer");
    }
    
    public void detach(Observer observer){
        list.remove(observer);
        System.out.println("detach an observer");
    }
    
    /**
     * 通知
     * @param newState
     */
    public void nodifyObservers(String newState){
        for(Observer observer : list){
            observer.update(newState);
        }
    }
}
