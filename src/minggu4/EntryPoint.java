package minggu4;

public class EntryPoint {
    public static void main(String[] args){
//        Employee employee = new Employee();
//        System.out.println(employee.getSalary());

        System.out.println(Foo.getNamaClass());

        Tabungan t1 = new Tabungan("t1",50000);
        t1.getNoRekening();

        Tabungan t2 = new Tabungan("t2", 10000);
        t2.getNoRekening();

        Tabungan t3 = new Tabungan("t3", 15000);
        t3.getNoRekening();
    }
    
}
