//3. Write a program to print multiplication table of a given number in a neat format

import java.util.*;

public class TablePrintingFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Table: ");
        int tableToPrint = scan.nextInt();
        int i = 1;

        while (i <= 12) {
            System.out.println(tableToPrint + " x " + i + " = " + (tableToPrint * i));
            i++;
        }
    }
}
