package com.tianzhuan.rxjavastudy.observer_pattern;

public class TestClient {
    public static void main(String[] args){
        Observer observer_1=new ObserverImpl();//警察1-- 观察者
        Observer observer_2=new ObserverImpl();//警察2
        Observer observer_3=new ObserverImpl();//警察3
        Observer observer_4=new ObserverImpl();//警察4
        Observer observer_5=new ObserverImpl();//警察5
        //一个小偷 被观察者
        Observable observable=new ObserableImpl();

        //关联 注册
        observable.registerObserver(observer_1);
        observable.registerObserver(observer_2);
        observable.registerObserver(observer_3);
        observable.registerObserver(observer_4);
        observable.registerObserver(observer_5);

        //小偷发生改变(被观察者发生了改变)
        observable.notifyObservers();
    }
}
