package Access.mypackage;

public class Main {
    public static void main(String[] args) {
        // 引用myClass 之前不需要 import Access.mypackage.MyClass;
        // 同一个package下，可以使用public，protected，friendly 方法； 不可以使用private 方法
        MyClass myClass = new MyClass();
        myClass.friendlyFun();
        myClass.publicFun();
        myClass.protectedFun();
        // myClass.privateFun();

        // FriendlyClass 在package内可以引用
        FriendlyClass friendlyClass = new FriendlyClass();

        System.out.println("Hello World!");
    }
}