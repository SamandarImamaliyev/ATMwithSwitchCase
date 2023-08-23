package ATMWithSwitchCase;

import java.util.Scanner;

public abstract class User {
    public double money;
    Scanner sc = new Scanner(System.in);

    public final void useATM() {

        while (true) {
            System.out.println(
                    "1. Balansi goster \n"
                            + "2. Hesabdan pul cek \n"
                            + "3. Hesaba pul qoy \n"
                            + "4. Pul gonder \n"
                            + "5. Cix");
            System.out.println("Emeliyyatin novunu daxil edin:");
            int operation = sc.nextInt();
            chooseOperation(operation);
        }

    }

    public abstract void chooseOperation(int operation);
}
