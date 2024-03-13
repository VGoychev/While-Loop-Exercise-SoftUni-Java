import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int daysSpending = 0;
        int daysCounter = 0;
        while (currentMoney < moneyNeeded){
            String text = scanner.nextLine();
            if (text.equals("spend")){
                double moneySpend = Double.parseDouble(scanner.nextLine());
                currentMoney = currentMoney - moneySpend;
                if(currentMoney <= 0){
                    currentMoney = 0;
                }
                daysSpending++;
                daysCounter++;
                if(daysSpending == 5){
                    break;
                }
            } else if (text.equals("save")){
                double moneySaved = Double.parseDouble(scanner.nextLine());
                currentMoney = currentMoney + moneySaved;
                daysCounter++;
                daysSpending = 0;
                if(currentMoney >= moneyNeeded){
                    System.out.printf("You saved the money for %d days.", daysCounter);
                    break;
                }
            }
        }
        if(daysSpending == 5) {
            System.out.printf("You can't save the money.%n");
            System.out.printf("%d", daysCounter);
        }
    }
}
