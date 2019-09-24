package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {
        int a= 100, b=30, c=40;

        System.out.println(min(a,b,c));
    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c){  return a;}
        else if (b < c && b < a){ return b;}
        else if (c < b && c < a) {return c;}
        return 0;
    }
}