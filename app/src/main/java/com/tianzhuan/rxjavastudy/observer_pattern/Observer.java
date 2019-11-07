package com.tianzhuan.rxjavastudy.observer_pattern;

/**
 * 观察者标准
 */
public interface Observer {
    /**
     * 收到被观察者发生改变
     * @param observableInfo
     * @param <T>
     */
   <T> void changeAction(T observableInfo);
}
