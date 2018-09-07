package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateWaiterNum {
    
    private int waiterNum;

    public int getWaiterNum() {
        return waiterNum;
    }

    public void setWaiterNum(int waiterNum) {
        this.waiterNum = waiterNum;
    }

    Connection.DBConnection conn = new Connection.DBConnection();
    Random r = new Random();

    public GenerateWaiterNum() {
        List<Integer> employeeIds = new ArrayList<Integer>(conn.retrieveIdColumn());
        int randomId = r.nextInt(employeeIds.size());
        setWaiterNum(employeeIds.get(randomId));
    }
}
