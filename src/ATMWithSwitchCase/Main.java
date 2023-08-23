package ATMWithSwitchCase;

import java.util.Scanner;

public class Main {

    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User1 user1 = new User1();
        User2 user2 = new User2();

        System.out.println("****  SM banka xos gelmisiniz  ****");
        while (true) {
            System.out.println("PIN-i daxil edin: ");
            int userPIN = sc.nextInt();
            if (userPIN == user1.getPIN()) {
                System.out.println(user1.getFullName() + ", hesabiniza xos gelmisiniz.");
                user1.useATM();
            } else if (userPIN == user2.getPIN()) {
                System.out.println(user2.getFullName() + ", hesabiniza xos gelmisiniz.");
                user2.useATM();
            } else {
                System.out.println("Yalnis PIN daxil etdiniz !!!");
                count++;
                if (count == 3) {
                    System.out.println("Kartiniz bloklandi, zehmet olmasa bankla elaqe saxlayin !");
                    System.exit(-1);
                }
            }
        }

    }
}