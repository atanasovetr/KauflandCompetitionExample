public class Table {
    private int d1;
    private int d2;
    private double[][] table;

    public Table(int d1, int d2){
        this.d1 = d1;
        this.d2 = d2;
        this.table = new double[this.d1][this.d2];
        fillingTable();
    }

    private void fillingTable() {
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table[i].length; j++) {
                this.table[i][j] = 100;
            }
        }
    }

    public void printTable(){
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table[i].length; j++) {
                System.out.printf("%.2f ",this.table[i][j] );
            }
            System.out.println();
        }
    }

    public void attackingCell(int row, int column, double damage){
        row -= 1;
        column -= 1;
        double neighDamage = 0;
        if(damage > 1 && damage < 30){
            neighDamage = 5;
        }
        else if(damage <= 70){
            neighDamage = 10;
        }
        else {
            neighDamage = damage * 0.2;
        }

        if(row > this.d1 || column > this.d2 || row < 0 || column < 0 ){
            System.out.println("Invalid cell");
        }
        else {
            this.table[row][column] -= damage;

            for (int i = -1; i <= 1; i++) {
                try {
                    if(this.table[row - 1][column + i] - neighDamage < 0){
                        this.table[row - 1][column + i] = 0;
                    }
                    else {
                        this.table[row - 1][column + i] -= neighDamage;
                    }
                } catch (Exception ignored) {
                }
            }
            try {
                if(this.table[row][column - 1] - neighDamage < 0) {
                    this.table[row][column - 1] = 0;
                }
                else{
                    this.table[row][column - 1] -= neighDamage;
                }
            } catch (Exception ignored) {
            }

            try {
                if(this.table[row][column + 1] - neighDamage < 0){
                    this.table[row][column + 1] = 0;
                }
                else{
                    this.table[row][column + 1] -= neighDamage;
                }
            } catch (Exception ignored) {
            }


            for (int i = -1; i <= 1; i++) {
                try {
                    if(this.table[row + 1][column + i] - neighDamage < 0) {
                        this.table[row + 1][column + i] = 0;
                    }
                    else{
                        this.table[row + 1][column + i] -= neighDamage;
                    }
                } catch (Exception ignored) {
                }

            }
        }

    }
}
