package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2F, fahrenheitFloat = 68.3F;
        double fahrenheitDouble = 22.0, celsiusDouble = 14.2;

        fahrenheitFloat = celsiusFloat * (9.0F / 5.0F) + 32;
        fahrenheitDouble = celsiusDouble * (9.0 / 5.0) + 32;

        System.out.println("Fahrenheit (Float): " + fahrenheitFloat);
        System.out.println("Fahrenheit (Double): " + fahrenheitDouble);
    }
}
