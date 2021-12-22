import java.util.Scanner;

//20/12/2021 Made by Rodolpho Henrique

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! This is a simple password generator, please enjoy :)");
        System.out.println("Inform the amount of lowercase, uppercase, symbol and numbers you want for your password respectively. (Press return after typing the amount.)");
        int charN = sc.nextInt();
        int charUpN = sc.nextInt();
        int symN = sc.nextInt();
        int numN = sc.nextInt();
        PassGen password = new PassGen(charN, charUpN, symN, numN);
        password.print();
        sc.close();
    }
}
