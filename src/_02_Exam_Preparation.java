import java.util.Scanner;

public class _02_Exam_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failsNeeded = Integer.parseInt(scanner.nextLine());
        int failedTests = 0;
        double sumAverage = 0.0;
        int exerciseNumber = 0;
        String lastProblem = "";

        while (failedTests<failsNeeded){
            String exerciseName = scanner.nextLine();
            if(exerciseName.equals("Enough")){
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                failedTests++;
            }
            exerciseNumber++;
            sumAverage = sumAverage + grade;
            lastProblem = exerciseName;
        }
        if(failedTests>=failsNeeded){
            System.out.printf("You need a break, %d poor grades.", failedTests);
        } else {
            System.out.printf("Average score: %.2f%n", sumAverage/exerciseNumber);
            System.out.printf("Number of problems: %d%n", exerciseNumber);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
