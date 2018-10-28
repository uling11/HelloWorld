package Type;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Primitive Type!");

        System.out.println("int (32bit):");
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Min byte: " + Byte.MIN_VALUE);
        System.out.println("==============");

        System.out.println("int (32bit):");
        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Min short: " + Short.MIN_VALUE);
        System.out.println("==============");

        System.out.println("int (32bit):");
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Min int: " + Integer.MIN_VALUE);
        System.out.println("==============");

        System.out.println("long (64bit):");
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Min long: " + Long.MIN_VALUE);
        System.out.println("==============");

        System.out.println("float (32bit):");
        float exampleFloat = 0.01f;
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Min float: " + Float.MIN_VALUE);
        System.out.println("Example float: " + exampleFloat);
        System.out.println("==============");

        System.out.println("double (64bit):");
        double exampleDouble = 1E-2; // 0.01, 0.01d
        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Min double: " + Double.MIN_VALUE);
        System.out.println("Example double: " + exampleDouble);
        System.out.println("==============");

        System.out.println("char (16bit):");
        char exampleChar = '\u5f20'; // '张'
        System.out.println("Max char: " + Character.MAX_VALUE);
        System.out.println("Min char: " + Character.MIN_VALUE);
        System.out.println("Example char: " + exampleChar);
        System.out.println("==============");

        System.out.println("boolean (1bit):");
        System.out.println("True boolean: " + true);
        System.out.println("False boolean: " + false);
        System.out.println("==============");

        System.out.println("The data type created: (DiType)");
        DiType di = new DiType();
        System.out.println("di'a: " + di.a);
        System.out.println("di'f: " + di.f);
        System.out.println("==============");

        System.out.println("The type contained method: (MethodClass)");
        MethodClass method = new MethodClass();
        System.out.println("method class (20+20) = " + method.sum(20,20));
        System.out.println("==============");
    }
}

// create a new data type
// 一个新的数据类型 (只包含数据）
class DiType {
    int a;
    float f;
}

// 一个包含方法的数据
// 方法只能定义在class中
/*
返回类型 方法名字(参数列表){
    方法
}
 */
class MethodClass {
    int sum(int a,int b){
        return  a+b;
    }
}