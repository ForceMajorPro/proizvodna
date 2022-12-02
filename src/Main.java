import org.w3c.dom.ls.LSOutput;

import java.net.SocketOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какую призводную вы хотите найти?");
        System.out.println("1.X^n");
        System.out.println("2.cosx");
        System.out.println("3.sinx");

        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("Вы выбрали Найти произвдную от X^n");
                System.out.print("Введите число ");

                int number = scanner.nextInt();

                System.out.print("Введите степень ");
                int n = scanner.nextInt();

                double proiz = n - 1;
                double number1 = number*n;

                System.out.print(number1);
                System.out.print("X^");
                System.out.println(proiz);
            break;

            case 2:
                System.out.println("Вы выбрали найти производную cosx");


            break;
        }



    }
}