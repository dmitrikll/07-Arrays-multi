package HW07;

import java.util.Scanner;

public class Main {

    static int[][] ticketNumbers;
    static int searchNum;
    static final int WINNUMBER = 43;

    public static void main(String[] args) {

        ticketNumbers = new int[][]{{23, 30, 89, 42}, {54, 68, 43, 11}, {90, 32, 44, 55}, {78, 52, 63, 31}};

        System.out.println("Lottery ticket numbers: ");

        for (int i = 0; i < ticketNumbers.length; i += 1) {
            for (int j = 0; j < ticketNumbers[i].length; j += 1) {
                System.out.print(ticketNumbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nPlease, enter a number: ");
        Scanner ticketScanner = new Scanner(System.in);
        searchNum = ticketScanner.nextInt();
        ticketScanner.nextLine();

        int index = 0;
        for (int[] ticketNumber : ticketNumbers) {
            for (int oneNum : ticketNumber) {
                if (searchNum != WINNUMBER) {
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
