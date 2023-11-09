import java.util.Scanner;

public class Prostokat {
    private float wysokosc;
    private float szerokosc;

    Prostokat(){
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Podaj wysokosc prostokata: ");
                wysokosc = s.nextFloat();
                if (wysokosc <= 0) throw new Exception();
            } catch (Exception e) {
                System.out.println("Nieprawidlowa liczba");
                continue;
            }
            try{
                System.out.println("Podaj szerokosc prostokata: ");
                szerokosc = s.nextFloat();
                if (szerokosc <= 0) throw new Exception();
            } catch (Exception e) {
                System.out.println("Nieprawidlowa liczba");
                continue;
            }
            break;
        }
    }
    public void obliczPow(){
        System.out.println("Pole prostokata wynosi: "+(wysokosc*szerokosc));
    }
}
