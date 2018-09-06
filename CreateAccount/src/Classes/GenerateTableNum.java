package Classes;

import java.util.Random;

public class GenerateTableNum {
    
    private int tableNumber;

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    
    Random rand = new Random();

    public GenerateTableNum() {
        this.tableNumber = rand.nextInt(50) + 1;
    }
}
