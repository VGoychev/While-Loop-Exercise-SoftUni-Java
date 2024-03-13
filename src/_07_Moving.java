import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int availableSpace = width * length * height;
        int boxSum = 0;
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            int box = Integer.parseInt(command);
            boxSum = boxSum + box;
            if(boxSum>=availableSpace){
                System.out.printf("No more free space! You need %d Cubic meters more.", boxSum - availableSpace);
                break;
            }

            command = scanner.nextLine();
        }
        if(availableSpace>boxSum){
            System.out.printf("%d Cubic meters left.", availableSpace - boxSum);
        }

    }
}
