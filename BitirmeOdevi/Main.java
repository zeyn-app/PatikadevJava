import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount, columnCount, row, column, counter = 0;

        System.out.print("Satır sayısını giriniz: ");
        rowCount = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        columnCount = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(rowCount, columnCount);

        String[][] gameBoard = mineSweeper.createGameBoard();
        String[][] maskedGameBoard = mineSweeper.createMaskedGameBoard();

        mineSweeper.printGameBoard(gameBoard);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n********************************");
        mineSweeper.printGameBoard(maskedGameBoard);

        while (true) {
            System.out.print("Satır numarasını giriniz: ");
            row = scanner.nextInt();
            System.out.print("Sütun numarasını giriniz: ");
            column = scanner.nextInt();

            if (gameBoard[row][column].equals("*")) {
                System.out.println("Game Over!");
                break;
            }
            else if(counter == mineSweeper.getMineCount()){
                System.out.println("*** Winner! ***");
                break;
            }
            else{
                if(maskedGameBoard[row][column].equals("-")) counter++;
                maskedGameBoard[row][column] = gameBoard[row][column];
                mineSweeper.printGameBoard(maskedGameBoard);
            }
        }
    }
}
