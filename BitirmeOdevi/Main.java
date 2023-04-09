import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int rowCount = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int columnCount = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(rowCount, columnCount);
        String[][] gameBoard = mineSweeper.createGameBoard();
        String[][] maskedgameBoard = mineSweeper.createMaskedGameBoard();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(gameBoard[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("********************************");

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(maskedgameBoard[i][j] + "\t");
            }
            System.out.println();
        }

        int row, column;

        while (true) {
            System.out.print("Satır numarasını giriniz: ");
            row = scanner.nextInt();
            System.out.print("Sütun numarasını giriniz: ");
            column = scanner.nextInt();

            if (gameBoard[row][column].equals("*")) {
                System.out.println("Game Over");
                break;
            } else {
                maskedgameBoard[row][column] = gameBoard[row][column];
                mineSweeper.printGameBoard(maskedgameBoard);
            }
        }
    }
}
