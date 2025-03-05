public class Table {
    private final int[][] table;

    public Table(int rows, int cols) {
        this.table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return this.table[row][col];
    }

    public void setValue(int row, int col, int value) {
        this.table[row][col] = value;
    }

    public int rows() {
        return this.table.length;
    }

    public int cols() {
        return this.table[0].length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int[] row : this.table) {
            for(int value : row) {
                sb.append(value).append(" ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }

    public double average() {
        int sum = 0;
        int count = 0;

        for(int[] row : this.table) {
            for(int value : row) {
                sum += value;
                ++count;
            }
        }

        return count > 0 ? (double)sum / (double)count : (double)0.0F;
    }
}
