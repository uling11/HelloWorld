package Access;
// import Access.mypackage.FriendlyClass;      cannot access
import Access.mypackage.MyClass;

public class Main {
    public static void main(String[] args) {
        // 引用myClass 之前需要 import Access.mypackage.MyClass;
        MyClass myClass = new MyClass();
        // package外 不能使用friendly, protected, private 方法
        myClass.publicFun();
        // myClass.protectedFun();
        // myClass.friendlyFun();
        // myClass.privateFun();


        // FriendlyClass 在package外不可以引用
        // FriendlyClass friendlyClass = new FriendlyClass();
        System.out.println("Hello World!");
    }
}