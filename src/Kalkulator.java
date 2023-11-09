import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wybierz figure do obliczenia");
            System.out.println("1. Kwadrat");
            System.out.println("2. Prostokat");
            System.out.println("3. Trojkat");
            System.out.println("4. wyjscie");
            byte opcja = s.nextByte();
            switch (opcja) {
                case 1:
                    Kwadrat x = new Kwadrat();
                    x.obliczPow();
                    break;
                case 2:
                    Prostokat y = new Prostokat();
                    y.obliczPow();
                    break;
                case 3:
                    Trojkat z = new Trojkat();
                    z.obliczPow();
                    break;
                case 4:
                    System.out.println("Dziekuje za skorzystanie z programu, do widzenia!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Cos nie zadzialalo, prosze sprobowac ponownie.");
            }
        }
    }
}
