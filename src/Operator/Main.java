package Operator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // + - * / % ++ --
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        System.out.println("select 2 random int from 0-100：" + a + " & " + b);
        System.out.println( a + "+" + b + ":\t" + (a+b));
        System.out.println( a + "-" + b + ":\t" + (a-b));
        System.out.println( a + "*" + b + ":\t" + (a*b));
        System.out.println( a + "/" + b + ":\t" + (a/b));
        System.out.println( a + "%" + b + ":\t" + (a%b));
        System.out.println("==============");

        double c  = new Random().nextDouble();
        double d  = new Random().nextDouble();
        System.out.println("select 2 random int from 0-1：" + c + " & " + d);
        System.out.println( c + "+" + d + ":\t" + (c+d));
        System.out.println( c + "-" + d + ":\t" + (c-d));
        System.out.println( c + "*" + d + ":\t" + (c*d));
        System.out.println( c + "/" + d + ":\t" + (c/d));
        System.out.println("==============");


        System.out.println("auto increment & decrement");
        int i = 1;
        System.out.println("i:\t\t" + i);
        System.out.println("++i:\t" + (++i));
        System.out.println("i++:\t" + (i++));
        System.out.println("i:\t\t" + i);
        System.out.println("--i:\t" + (--i));
        System.out.println("i--:\t" + (i--));
        System.out.println("i:\t\t" + i);
        System.out.println("==============");

        System.out.println("logic operator");
        System.out.println("true && true:\t" + (true && true) );
        System.out.println("false && true:\t" + (false && true) );
        System.out.println("true || true:\t" + (true || true) );
        System.out.println("true || false:\t" + (true || false) );
        System.out.println("!true:\t\t\t" + (!true) );
        System.out.println("==============");

        System.out.println("Ternary if-else operator");
        int t = new Random().nextInt(100);
        System.out.println(t + ">50?100:0\t=\t" + (t>50?100:0) );
        System.out.println("==============");

        System.out.println("Relational operator");
        System.out.println(a + "==" + b + ":\t" + (a==b));
        System.out.println(a + ">=" + b + ":\t" + (a>=b));
        System.out.println(a + "<=" + b + ":\t" + (a<=b));
        System.out.println(a + ">" + b + ":\t" + (a>b));
        System.out.println(a + "<" + b + ":\t" + (a<b));
        System.out.println(a + "!=" + b + ":\t" + (a!=b));
        System.out.println("==============");
    }
}