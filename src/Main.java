import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        System.out.print("Üçgenin 1. Kenarını Giriniz: ");
        a = scanner.nextInt();
        
        System.out.print("Üçgenin 2. Kenarını Giriniz: ");
        b = scanner.nextInt();

        c = Math.sqrt(a*a+b*b);

        System.out.println("Hipotenüs: " + c);
        System.out.println("Üçgenin çevresi: " +(a+b+c));
        System.out.println("Üçgenin alanı: " + (a*b)/2);


    }
}
