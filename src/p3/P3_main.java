package p3;
import java.util.Scanner;

public class P3_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Man geht davon aus, dass der Nutzer keine falschen Eingaben tätigt
        System.out.print("Erstes Boolean: ");
        boolean x = sc.nextBoolean();
        System.out.print("Erstes Boolean: ");
        boolean y = sc.nextBoolean();

        if(!(x != y && x == y)){
            System.out.println("a) => True");
        } else {
            System.out.println("a) => False");
        }

        if(x || true){
            System.out.println("b) => True");
        } else {
            System.out.println("b) => False");
        }

        if(x && false) {
            System.out.println("c) => True");
        } else {
            System.out.println("c) => False");
        }

        if((x && !y) || (!x)) {
            System.out.println("d) => True");
        } else {
            System.out.println("d) => False");
        }
    }
}
