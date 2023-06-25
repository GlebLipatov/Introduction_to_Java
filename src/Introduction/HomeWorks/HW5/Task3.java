package Introduction.HomeWorks.HW5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    private static final int SIZE = 8;
    private static final boolean EMPTY = false;
    private static final boolean QUEEN = true;
    private ArrayList<Boolean[][]> fields = new ArrayList<>();
    private Boolean[][] field = new Boolean[SIZE][SIZE];
    private int count = 0;

    // хранит положение ферзей в ряду
    // индекс - номер ряда,
    // значение - номер клетки,
    // -1 в конкретном ряду ферзя нет
    private Integer[] queens = new Integer[SIZE];

    public ArrayList<Boolean[][]> solution() {

        field = initField(field);
        queens = initQueens(queens);

        start(0);
        return fields;
    }

    /**
     * Enter the queen on the current row
     *
     * @param - Integer
     * @return Integer
     */
    private Integer start(Integer row) {
        if (fields.size() == 92) return null;
        if (!hasNextPosition(row)) {

            if (hasQueen(row))
                removeQueen(row);

            if (row > 0)
                return start(row - 1);
        } else {
            int nextPosition = getNextPosition(row);

            if (hasQueen(row))
                removeQueen(row);

            field[row][nextPosition] = QUEEN;
            queens[row] = nextPosition;

            if (row < 7) {
                start(row + 1);
            } else {
                addField(field);
                removeQueen(row);
                start(row - 1);
            }
        }
        return null;
    }

    /**
     * Add field to List with results.
     * @param - Boolean[][]
     */
    private void addField(Boolean[][] field) {
        Boolean[][] next = new Boolean[SIZE][SIZE];
        for (int i = 0; i < 8;i++) {
            for (int j = 0; j < 8; j++) {
                next[i][j] = field[i][j];
            }
        }
        fields.add(next);
    }

    /**
     * Get next position to the queen on the current row
     *
     * @param - int
     * @return int
     */
    private int getNextPosition(int row) {
        int nextCell;
        int nextPosition = 0;

        if (hasQueen(row)) {
            nextCell = queens[row] + 1;
        } else {
            nextCell = 0;
        }

        for (int cell = nextCell; cell < 8; cell++) {
            if (checkLines(row, cell)) {
                nextPosition = cell;
                break;
            }
        }
        return nextPosition;
    }

    /**
     * Remove queen from field and queens
     *
     * @param - int
     */
    private void removeQueen(int row) {
        int cell = queens[row];

        field[row][cell] = EMPTY;
        queens[row] = -1;
    }

    /**
     * Check next position to the queen
     *
     * @param - int
     * @return boolean
     */
    private boolean hasNextPosition(int row) {
        if (queens[7] == 7) return false;
        if (queens[0] == -1) return true;

        int nextCell;

        if (hasQueen(row))
            nextCell = this.queens[row] + 1;
        else
            nextCell = 0;

        for (int cell = nextCell; cell < SIZE; cell++) {
            if (checkLines(row, cell)) return true;
        }
        return false;
    }

    /**
     * Check the queen at all lines.
     *
     * @param - int
     * @param - int
     * @return boolean
     */
    private boolean checkLines(int row, int cell) {
        if (!checkColumn(row, cell))
            if (!checkLeftDiagonal(row, cell))
                if (!checkRightDiagonal(row, cell))
                    return true;
        return false;
    }

    /**
     * Check the queen in the right diagonal.
     *
     * @param - int
     * @param - int
     * @return boolean
     */
    private boolean checkRightDiagonal(int row, int cell) {
        if (row > 0 && cell < 6)
            for (int r = row - 1, c = cell + 1; r >= 0 && c < SIZE; r--, c++)
                if (field[r][c]) return true;
        return false;
    }

    /**
     * Check the queen in the left diagonal.
     *
     * @param - int
     * @param - int
     * @return boolean
     */
    private boolean checkLeftDiagonal(int row, int cell) {
        if (row > 0 && cell > 0)
            for (int r = row - 1, c = cell - 1; r >= 0 && c >= 0; r--, c--)
                if (field[r][c]) return true;
        return false;
    }

    /**
     * Check the queen in the column.
     *
     * @param - int
     * @param - int
     * @return boolean
     */
    private boolean checkColumn(int row, int cell) {
        if (row > 0)
            for (int r = row - 1; r >= 0; r--)
                if (field[r][cell]) return true;
        return false;
    }

    /**
     * Check the queen in the current row.
     *
     * @param - current row
     * @return Boolean
     */
    private Boolean hasQueen(int row) {
        if (queens[row] == -1) return false;
        return true;
    }

    /**
     * Init field arrays int the current arrays.
     *
     * @param - Boolean[][]
     * @return Boolean[][]
     */
    private Boolean[][] initField(Boolean[][] field) {
        for (int row = 0; row < SIZE; row++) {
            for (int cell = 0; cell < SIZE; cell++) {
                field[row][cell] = EMPTY;
            }
        }
        return field;
    }

    /**
     * Init queens array in the current array.
     *
     * @param - Integer[]
     * @return - Integer[]
     */
    private Integer[] initQueens(Integer[] queens) {
        for (int i = 0; i < SIZE; i++) {
            queens[i] = -1;
        }
        return queens;
    }

    /**
     * Show field
     */
    public void print(Boolean[][] field) {

        for (int row = 0; row < SIZE; row++) {
            if (row == 0) { // Нумерация колонок
                for (int i = 0; i < SIZE; i++) {
                    System.out.print("\t" + i);
                }
                System.out.println();
            }
            for (int cell = 0; cell < SIZE; cell++) {
                if (cell == 0) System.out.print(row + "\t"); // Нумерация строк
                if (field[row][cell]) System.out.print('Q' + "\t");
                else System.out.print('*' + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
