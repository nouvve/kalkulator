import java.util.Scanner;

public class Kwadrat {
    private float dlugosc;
    Kwadrat(){
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Podaj wysokosc kwadratu: ");
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
        System.out.println("Pole kwadratu wynosi: "+(dlugosc*dlugosc));
    }
}
