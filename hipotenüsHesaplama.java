import java.sql.SQLOutput;
import java.util.Scanner;

public class hipotenüsHesaplama {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenar değerini giriniz : ");
        a = inp.nextInt();
        System.out.print("2. kenar değerini giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.print("hipotenüs değeri : " + c);
    }
}
