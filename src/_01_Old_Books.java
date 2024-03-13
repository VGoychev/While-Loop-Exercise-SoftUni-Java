import java.util.Scanner;

public class _01_Old_Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     String bookName = scanner.nextLine();
     int counter = 0;
     String bookName2 = scanner.nextLine();
        while (!bookName2.equals(bookName)){
            bookName2 = scanner.nextLine();
            counter++;
            if(bookName2.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", counter);
                break;
            }
        }
        if(bookName2.equals(bookName)) {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}
