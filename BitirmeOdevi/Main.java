import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int rowCount = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int columnCount = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(rowCount, columnCount);
        String [][] maskedMatrix = mineSweeper.createGameBoard();


        System.out.println("********************************");

        for(int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(maskedMatrix[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
