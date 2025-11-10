package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 6;
        int intResult;

        double x = 1.5, y = 2.3;
        double doubleResult;

        intResult = c - a * 3;
        //Frage 1: Der Wert auf der rechten Seite ist -3
        //Frage 2: Kein Compilerfehler da -3 in dem int Datentyp enthalten ist
        System.out.println(intResult);

        intResult = c / b;
        //Frage 1: Der Wert auf der rechten Seite ist 6/5 bzw 1.2
        //Frage 2: Kein Compilerfehler da 1.2 auf 1 gerundet wird und 1 in int enthalten ist
        System.out.println(intResult);

        intResult = a + b / c;
        //Frage 1: Der Wert auf der rechten Seite ist 3 + 5/6 bzw ungefähr 3.83
        //Frage 2: Kein Compilerfehler da 0.83 auf 0 gerundet wird und 0 + 3 = 3 in int enthalten ist
        System.out.println(intResult);

        doubleResult = (double) c / b;
        //Frage 1: Der Wert auf der rechten Seite ist 6/5 also 1.2
        //Frage 2: Kein Compilerfehler, da sich 1.2 im Bereich des double Datentyp befindet.
        //Hier ist ein (double) nötig, da sonst 1.2 wegen des int Datentyps auf 1 gekürzt wird
        System.out.println(doubleResult);

        doubleResult = (double) c + a / b;
        //Frage 1: Der Wert auf der rechten Seite ist 6.6
        //Frage 2: Kein Compilerfehler, da sich 6.6 im Bereich des double Datentyp befindet.
        //Hier ist ein (double) nötig, da sonst 6.6 wegen des int Datentyps auf 6 gekürzt wird
        System.out.println(doubleResult);

        doubleResult = x + y * b;
        //Frage 1: Der Wert auf der rechten Seite ist 13.0
        //Frage 2: Kein Compilerfehler, da sich 13.0 im Bereich des double Datentyp befindet.
        //Hier ist ein (double) nicht nötig, da alle nur mit float Datentyp multipliziert und dividiert wird
        System.out.println(doubleResult);
    }
}
