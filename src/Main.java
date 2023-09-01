import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        double e;
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı giriniz : ");
        a = input.nextInt();

        System.out.print("2. kenarı giriniz : ");
        b = input.nextInt();

        System.out.print("3. kenarı giriniz : ");
        c = input.nextInt();

        d = (a + b + c);

        e = Math.sqrt((d / 2.0) * (d / 2.0 - a) * (d / 2.0 - b) * (d / 2.0 - c));

        System.out.println("Üçgenin çevresi = " + d);
        System.out.println("Üçgenin alanı = " + e);


    }
}
