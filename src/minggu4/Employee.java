package minggu4;

import java.math.BigDecimal;

public class Employee {
    private BigDecimal salary = new BigDecimal(50000);

    public BigDecimal getSalary(){
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
