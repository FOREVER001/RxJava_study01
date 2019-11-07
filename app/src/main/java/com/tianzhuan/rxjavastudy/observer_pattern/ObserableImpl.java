package com.tianzhuan.rxjavastudy.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实现类
 */
public class ObserableImpl implements Observable{
    private List<Observer> mObserverList = new ArrayList<>();//观察者容器
    @Override
    public void registerObserver(Observer observer) {
        mObserverList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        mObserverList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mObserverList) {
            //在被观察者实现类中，通知所有注册好的观察者
            observer.changeAction("被观察者发生了改变");
        }
    }
}
