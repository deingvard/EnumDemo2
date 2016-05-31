/**
 * Created by igor on 31.05.16.
 */

enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple, apple2, apple3;
        for (Apple a:
             Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        apple = Apple.RedDel;
        apple2 = Apple.GoldenDel;
        apple3 = Apple.RedDel;

        System.out.println();

        //demonstration
        if (apple.compareTo(apple2) < 0) {
            System.out.println(apple + " preceded "+ apple2);
        }
        if (apple.compareTo(apple2) > 0) {
            System.out.println(apple2 + " preceded "+ apple);
        }
        if (apple.compareTo(apple3) == 0) {
            System.out.println(apple + " preceded"+ apple3);
        }
        System.out.println();

        if (apple.equals(apple2)){
            System.out.println("Error!");
        }
        if (apple.equals(apple3)){
            System.out.println(apple + " = " +apple3);
        }
        if (apple == apple3){
            System.out.println(apple + " == " +apple3);
        }
    }
}
