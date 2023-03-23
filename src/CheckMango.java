import java.lang.Math;
import java.util.Scanner;
public class CheckMango {

    public static void checkForMango(int numberOfRows, int numberOfColumns, int treeNumber){
        double rowPositionOfTree = treeNumber/numberOfRows;
        int columnPositionOfTree = treeNumber % numberOfColumns;

        System.out.println(String.valueOf(rowPositionOfTree) + columnPositionOfTree);

        if(Math.ceil(rowPositionOfTree) == 1.0)
            System.out.println("yes");
        else if(columnPositionOfTree == 1 || columnPositionOfTree == numberOfColumns)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int numberOfRows = input.nextInt();
        System.out.println("Enter Number Of Columns: ");
        int numberOfColumns = input.nextInt();
        System.out.println("Enter Tree Number: ");
        int treeNumber = input.nextInt();

        checkForMango(numberOfRows, numberOfColumns, treeNumber);
    }
}