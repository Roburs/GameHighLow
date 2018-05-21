import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class TooMuchTooLittle {
    public static void main(String[] args) {

        Scanner now = new Scanner(System.in);
        boolean bool = true;

        Random generator = new Random(new Date().getTime());
        int number = generator.nextInt(101);

        System.out.print("Podaj liczbe: ");

        while(bool) {

            int var;
            var = now.nextInt();

            if (var == number) {
                System.out.print("Gratulacje");
                bool = false;
            } else if (var > number) {
                System.out.print("Podałeś za dużą wartość\n");
            }else System.out.print("Podałeś za małą wartość\n");
        }
    }
}


