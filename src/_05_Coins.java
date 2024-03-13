import java.util.Scanner;

public class _05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double totalCoins = Math.floor(sum * 100);
        int countCoins = 0;
        while (totalCoins > 0){
            if(totalCoins >= 200){
                totalCoins -= 200;
                countCoins++;
            } else if(totalCoins >= 100){
                totalCoins -= 100;
                countCoins++;
            } else if (totalCoins >= 50){
                totalCoins -= 50;
                countCoins++;
            } else if (totalCoins >= 20){
                totalCoins -= 20;
                countCoins++;
            } else if (totalCoins >= 10) {
                totalCoins -= 10;
                countCoins++;
            } else if (totalCoins >= 5) {
                totalCoins -= 5;
                countCoins++;
            } else if (totalCoins >= 2) {
                totalCoins -= 2;
                countCoins++;
            } else if (totalCoins >= 1) {
                totalCoins -= 1;
                countCoins++;
            }
        }
        System.out.printf("%d", countCoins);
    }
}
