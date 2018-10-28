package Access;

import Access.mypackage.MyClass;

public class MyChildClass extends MyClass {
    void childScope(){
        publicFun();
        // 在子类中可以继承 protected 方法
        protectedFun();
        // friendlyFun();
        // privateFun();
    }
    public static void main(String[] args) {
        // 引用myClass 之前需要 import Access.mypackage.MyClass;
        MyClass myClass = new MyClass();
        // package外 不能使用friendly, protected, private 方法
        myClass.publicFun();
        // myClass.protectedFun();
        // myClass.friendlyFun();
        // myClass.privateFun();

        System.out.println("Hello World!");
    }
}
