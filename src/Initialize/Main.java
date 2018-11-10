package Initialize;

// 1. 如果class 不写构造器，编译器会自动增加一个默认无参数的构造器
// 2. 构造器的命名必须和类名保持一致
// 3. 构造器没有返回值


class Bird {
    String name = "Default";
    int feet = 4;

    Bird(){
        System.out.println("feet: " + feet);
    }
    Bird(String name){
        System.out.println("Before: " + this.name);
        System.out.println("this is the constructor with string");
        this.name = name;
        System.out.println("After: " + this.name);
    }
    Bird(int feet){
        System.out.println("this is the constructor with int");
        this.feet = feet;
    }
    Bird(int feet,String name){
        System.out.println("this is the constructor with int and string");
        this.feet = feet;
        this.name = name;
    }
    String getName(){
        return name;
    }
    String getThisName(){
        return this.name;
    }

    Bird increase(){
        feet ++;
        return this;
    }
}


// this: 返回这个实例后的参数本身的引用
// this 可以把当前对象的引用传递给另外一个方法
class Person {
    String name = "ddd";
    int id = 0;
    String height = "150";
    void eatApple(){
        Apple anApple = new Apple(1);
        Apple anotherApple = new Apple(2);
        System.out.println("Before: " + anApple.peeled);
        anApple.getPeeled();
        System.out.println("After: " + anApple.peeled);
    }
}

class Peeler {
    static Apple peel(Apple apple){
        // 削皮
        System.out.println(apple.uniqueId);
        apple.peeled = true;
        return apple;
    }
}

class Apple {
    int uniqueId;
    Apple(int id){
        uniqueId = id;
    }
    boolean peeled = false;
    Apple getPeeled() {
        System.out.println(this.uniqueId);
        return Peeler.peel(this);
    }
}


// Static 静态
class A {
    // static var
    Integer dynamicValue = 10;
    static Integer staticValue = 10;
    // static block 静态的代码块
    // 在第一个这个类被访问的时候 （第一次实例化 或者 第一次调用静态方法）
    static {
        System.out.println("Now static value is "+ staticValue);
        staticValue = 20;
        System.out.println("Now static value is "+ staticValue);
    }
    // 构造器
    A(int a){
        staticValue = a;
        System.out.println(staticValue);
    }
    // static function
    void function(){
        System.out.println("this is a function");
    }
    static void staticFunction(){
        System.out.println("Now static value is from function"+ staticValue);
        System.out.println("this is a static function");
    }
}

//enumerated 枚举
enum Week {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class Main {
    public static void main(String[] args) {
        // No default
        //Bird bDefault = new Bird();
        //Bird bWith5Feet = new Bird(5);
        //bWith5Feet.increase();
        //System.out.println(bWith5Feet.name + " has " + bWith5Feet.increase().increase().increase().feet + " feet");
        //System.out.println(bWith5Feet.name + " has " + bWith5Feet.feet + " feet");

        //
        // 1. 创建一个Bird 类型的变量
        // 2. 变量会包含name 和 feet这两个属性
        // 3. 执行构造器的初始化方法
        //Bird bWithName = new Bird("Jingtian");
        //System.out.println(bWithName.name + " has " + bWithName.feet + " feet");

        //Person p = new Person();
        //p.eatApple();
        //System.out.println("Person Name: " + p.name);
        //A.staticFunction();

        A a0 = new A(5);
        //a0.staticFunction();
        //a0.dynamicValue = 2;
        //a0.staticValue = 2;
        //a0.function();
       // System.out.println("dynamic " + a0.dynamicValue);
        //System.out.println("static " + a0.staticValue);
        //A a1 = new A();b
        //System.out.println("dynamic " + a1.dynamicValue);
        //System.out.println("static " + a1.staticValue);

        int a = 0;
        //int aArray[];
        // 数组的长度是固定的
        int[] bArray = {1,2,3,4,5,6,7};
        int[] cArray = new int[7];
        System.out.println("Array's length is : " + bArray.length);
        for (int b: bArray){
            System.out.println(b);
        }


        //enumerated 枚举
        Week monday = Week.MONDAY;
        System.out.println(monday + " :" +  monday.ordinal());
        System.out.println(Week.THURSDAY.ordinal());
        Week week = Week.FRIDAY;
        switch (week){
            case THURSDAY:
            case FRIDAY:
                System.out.println("this is a workday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("this is a weekend");
                break;
            default:
                System.out.println("NOT SUPPORTED");
        }
    }
}