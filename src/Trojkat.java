import java.util.Scanner;

public class Trojkat {
    private float wysokosc;
    private float dlugosc;

    Trojkat(){
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Podaj wysokosc trojkata: ");
                wysokosc = s.nextFloat();
                if (wysokosc <= 0) throw new Exception();
            } catch (Exception e) {
                System.out.println("Nieprawidlowa liczba");
                continue;
            }
            try{
                System.out.println("Podaj szerokosc trojkata: ");
                dlugosc = s.nextFloat();
                if (dlugosc <= 0) throw new Exception();
            } catch (Exception e) {
                System.out.println("Nieprawidlowa liczba");
                continue;
            }
            break;
        }
    }

    public void obliczPow(){
        System.out.println("Pole trojkata wynosi: "+((dlugosc*wysokosc)/2));
    }
}
