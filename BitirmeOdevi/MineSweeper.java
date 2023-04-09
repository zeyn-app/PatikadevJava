public class MineSweeper {
    private final int rowCount;
    private final int columnCount;
    private final int[][] mineMatrix;
    private final int mineCount;

    public MineSweeper(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        mineMatrix = new int[rowCount][columnCount];
        mineCount = rowCount * columnCount / 4;
    }

    public void createMine() {
        int rowIndex, columnIndex;

        for (int i = 0; i < mineCount; i++) {
            rowIndex = (int) (Math.random() * (rowCount - 1)) + 1;
            columnIndex = (int) (Math.random() * (columnCount - 1)) + 1;

            while (mineMatrix[rowIndex][columnIndex] == -1) {
                rowIndex = (int) (Math.random() * (rowCount - 1)) + 1;
                columnIndex = (int) (Math.random() * (columnCount - 1)) + 1;
            }
            mineMatrix[rowIndex][columnIndex] = -1;
        }
    }

    public void calculateNeighborMine() {
        createMine();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (mineMatrix[i][j] == -1) {
                    if (i > 0) {
                        if (j > 0 && mineMatrix[i - 1][j - 1] != -1) mineMatrix[i - 1][j - 1]++;
                        if (j < columnCount - 1 && mineMatrix[i - 1][j + 1] != -1) mineMatrix[i - 1][j + 1]++;
                        if (mineMatrix[i - 1][j] != -1) mineMatrix[i - 1][j]++;
                    }
                    if (i < rowCount - 1) {
                        if (j > 0 && mineMatrix[i + 1][j - 1] != -1) mineMatrix[i + 1][j - 1]++;
                        if (j < columnCount - 1 && mineMatrix[i + 1][j + 1] != -1) mineMatrix[i + 1][j + 1]++;
                        if (mineMatrix[i + 1][j] != -1) mineMatrix[i + 1][j]++;
                    }
                    if (j > 0 && mineMatrix[i][j - 1] != -1) mineMatrix[i][j - 1]++;
                    if (j < columnCount - 1 && mineMatrix[i][j + 1] != -1) mineMatrix[i][j + 1]++;
                }
            }
        }
    }

    public String[][] createGameBoard() {
        String[][] gameBoard = new String[rowCount][columnCount];
        calculateNeighborMine();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (mineMatrix[i][j] == -1) {
                    gameBoard[i][j] = "*";
                } else {
                    gameBoard[i][j] = Integer.toString(mineMatrix[i][j]);
                }
            }
        }
        return gameBoard;
    }
}
