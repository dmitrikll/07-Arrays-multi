package HW07;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static int[][] ticketNumbers;
    static int searchNum;
    final static int WINTICKET = 43;

    public static void main(String[] args) {

        ticketNumbers = new int[][]{{23, 30, 89, 42}, {54, 68, 43, 11}, {90, 32, 44, 55}, {78, 52, 63, 31}};

        System.out.print("\nPlease, enter a number: ");
        Scanner ticketScanner = new Scanner(System.in);
        searchNum = ticketScanner.nextInt();
        ticketScanner.nextLine();

        int index = 0;
        for (int i = 0; i < ticketNumbers.length; i += 1) {
            for (int j = 0; j < ticketNumbers[i].length; j += 1) {
                if (searchNum != WINTICKET) {
                    index += 1;
                }
            }
        }

        if (index > 0) {
            System.out.println("You number is lost - try again next time...");
        } else {
            System.out.println("You number is won - congratulations!");
        }
    }
}
