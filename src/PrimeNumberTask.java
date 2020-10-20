import java.lang.Math;
import java.util.Scanner;

public class PrimeNumberTask {

    public static void main(String[] args) {

        boolean repeatTheWholeProcess = true;


        while (repeatTheWholeProcess) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un número entre 2 y 500: ");

            int usersNumber = scanner.nextInt();


            if (usersNumber > 2 && usersNumber < 500) {


                int usersNumberSquareRoot = (int) Math.sqrt(usersNumber);

                boolean primeOrNot = true;

                for (int startPoint = 2; startPoint <= usersNumberSquareRoot; ++startPoint) {

                    if (usersNumber % startPoint == 0) {
                        primeOrNot = false;



                    }
                } if (primeOrNot == true) {

                    System.out.println("El numero " + usersNumber + " es primo");

                } else{

                    System.out.println("El numero " + usersNumber + " no es primo");


                }

            } else {
                System.out.println("You're not following the rules");
            }


        }
    }
}