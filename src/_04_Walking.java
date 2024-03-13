import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int totalSteps = 0;
        int difference = 0;
        String command = scanner.nextLine();

        while (!command.equals("Going home")){
            int steps = Integer.parseInt(command);
            totalSteps = totalSteps + steps;
            if (totalSteps >= goal){
                break;
            }
            command = scanner.nextLine();
        }
        if(command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            totalSteps = totalSteps + stepsToHome;
        }
        if(totalSteps >= goal){
            difference = totalSteps - goal;
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", difference);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - totalSteps);
        }
    }
 }

