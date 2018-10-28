package Control;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("if-else");
        int i = new Random().nextInt(100);
        if (i > 70){
            System.out.println(i + " is greater than 70");
        }
        else if (i >50 ){
            System.out.println(i + " is greater than 50");
        }
        else {
            System.out.println(i + " is less than or equal to 50");
        }
        System.out.println("==============");

        System.out.println("for: count from 0 to 9");
        for (int index = 0; index < 10; index ++){
            System.out.print(index + " ");
        }
        System.out.print("\n");
        System.out.println("==============");

        System.out.println("foreach: list weekdays");
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        for (String day : days){
            System.out.print(day + ", ");
        }
        System.out.print("\n");
        System.out.println("==============");

        System.out.println("while: if number is less than 5, then do, otherwise exit loop");
        i = 2;
        while(i<5){
            System.out.print(i + " ");
            i = new Random().nextInt(10);
        }
        System.out.print("\n");
        System.out.println("==============");

        System.out.println("do-while: do and if number is less than 5, then next, otherwise exit loop; execute at least once");
        do{
            System.out.print(i + " ");
            i = new Random().nextInt(10);
        }while(i<5);
        System.out.print("\n");
        System.out.println("==============");

        System.out.println("Switch(int) 分数在0~6 => D; 6,7 => C; 8,9 => B; 10 => A ; 其他 ERROR");
        for (int index = 0; index < 5; index ++){
            int mark = new Random().nextInt(15);
            String result = "";
            switch(mark) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    result = "D";
                    break;
                case 6:
                case 7:
                    result = "C";
                    break;
                case 8:
                case 9:
                    result = "B";
                    break;
                case 10:
                    result = "A";
                    break;
                default:
                    result = "ERROR";
            }
            System.out.println("Mark " + mark + ": " + result);
        }
        System.out.println("==============");

        System.out.println("Switch(String) *switch 从JDK 1.7开始支持String");
        for (String date : days){
            switch(date) {
                case "MON":
                case "TUE":
                case "WED":
                case "THU":
                case "FRI":
                    System.out.println(date + ":\t" + "THIS IS A WEEKDAY");
                    break;
                case "SAT":
                case "SUN":
                    System.out.println(date + ":\t" + "THIS IS A WEEKEND");
                    break;
                default:
                    System.out.println(date + ":\t" + "I don't understand");
            }
        }
    }
}
