package ru.geekbrain.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
     printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords (){
        System.out.println("Orange\n" +
                "Banana\n" +
                "Apple");
    }

    public static void checkSumSign(){
        int a = 20;
        int b = 10;

        if ((a+b)>=0) {
            System.out.println("Сумма положительная");}
        else {System.out.println("Сумма отрицательная");}
    }

    public static void printColor(){
        int value = 20;
        if (value<=0){
            System.out.println("Красный");
        }
        else  if ((value>0) && (value<=100)) {
            System.out.println("Жёлтый");
        }
    else {
            System.out.println("Зеленый");
        }
    }

    public static  void compareNumbers(){
        int a = 10;
        int b = 10;

        if (a>=b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }




}
