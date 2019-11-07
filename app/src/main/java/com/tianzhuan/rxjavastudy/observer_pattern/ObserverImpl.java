package com.tianzhuan.rxjavastudy.observer_pattern;

/**
 * 观察者实现类
 */
public class ObserverImpl implements Observer{
    @Override
    public <T> void changeAction(T observableInfo) {
        System.out.println(observableInfo);
    }
}
