package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = false,y = true,a = true,b = true,c = false;
        int input = 10;

        if(input == 10 || input == 11) {
            x = true;
        }else {
            x = false;
        }

        if(input == 11 || input == 1) {
            y = true;
        } else {
            y = false;
        }

        if (x && y) {
            a = true;
        } else {
            a = false;
        }

        if (x || x !=y) {
            b = true;
        } else {
            b = false;
        }

        if (((!x) && (!y)) || (x && (!y))) {
            c = true;
        } else {
            c = false;
        }
    }
}
