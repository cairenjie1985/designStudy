package com.caixin.designStudy.subject.service.impl;

import com.caixin.designStudy.subject.service.Observer;

public class ConcreteObserver implements Observer {

    //观察者的状态
    private String observerState;
   
    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("美国球员开始跑!");
    }

}
