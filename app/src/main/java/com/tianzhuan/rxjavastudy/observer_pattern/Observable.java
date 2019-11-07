package com.tianzhuan.rxjavastudy.observer_pattern;

/**
 * 被观察则标准
 */
public interface Observable {
    /**
     * 在被观察者中注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);
    /**
     * 在被观察者中注销观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 在被观察者中通知所有注册的观察者
     */
    void notifyObservers();
}
