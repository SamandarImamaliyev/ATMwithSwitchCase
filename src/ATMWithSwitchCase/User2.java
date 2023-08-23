package ATMWithSwitchCase;

public class User2 extends User {
    private int PIN = 8888;
    private int accountNumber = 987654;

    private String fullName = "Cabbar Aliyev";

    public String getFullName() {
        return fullName;
    }

    public int getPIN() {
        return PIN;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void chooseOperation(int operation) {

        switch (operation) {
            case 1:
                System.out.println("Balansiniz :" + money);
                break;
            case 2:
                System.out.println("Cekmek istediyiniz pulun  miqdari: ");
                int withdrawnMoney = sc.nextInt();
                if (withdrawnMoney > money) {
                    System.out.println("Balansinizda kifayet qeder mebleg yoxdur !");
                } else {
                    System.out.println("Emeliyyat ugurla yerine yetirildi !");
                    money = money - withdrawnMoney;
                }
                break;
            case 3:
                System.out.println("Qoymaq istediyiniz pulun  miqdari: ");
                int insertedMoney = sc.nextInt();
                System.out.println("Emeliyyat ugurla yerine yetirildi !");
                money = money + insertedMoney;
                break;
            case 4:
                System.out.println("Pul gondermek istediyiniz hesabi qeyd edin :");
                int anotherAccount = sc.nextInt();
                User1 user1 = new User1();
                if (anotherAccount == user1.getAccountNumber()) {
                    System.out.println("Gondermek istediyiniz meblegi qeyd edin:");
                    int sendingMoney = sc.nextInt();
                    if (sendingMoney <= money) {
                        money = money - sendingMoney;
                        user1.money = user1.money + sendingMoney;
                        System.out.println("Emeliyyat ugurla tamamlandi !");
                    } else {
                        System.out.println("Hesabinizda kifayet qeder pul yoxdur !!!");
                    }
                } else {
                    System.out.println("Yalnis hesab nomresi !!!");
                }
                break;
            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("Yalnis emeliyyat !!!");
                System.exit(0);
                break;
        }
    }
}
