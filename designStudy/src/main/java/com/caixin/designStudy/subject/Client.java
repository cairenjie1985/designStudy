package com.caixin.designStudy.subject;

import com.caixin.designStudy.subject.service.Observer;
import com.caixin.designStudy.subject.service.impl.ConcreteObserver;
import com.caixin.designStudy.subject.service.impl.ConcreteObserver1;
import com.caixin.designStudy.subject.service.impl.ConcreteObserver2;

public class Client {

    public static void main(String[] args) {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        subject.attach(observer1);
        subject.attach(observer2);
        //改变主题对象的状态
        subject.change("美国队员发球!");
    }

}
