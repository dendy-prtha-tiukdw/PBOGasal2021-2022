package minggu1_2;

public class OperatorBitwise {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        System.out.println("a & b = "+c);
        // 11 1100
        // 00 1101
        // 00 1100

        c = a | b;
        System.out.println("a | b = " + c);

        c = a ^ b;
        System.out.println("a ^ b = " + c);

        c = a << 2;

        System.out.println("a << 2 = " + c);

        boolean suka = !true;
        System.out.println(suka ? "iya" : "tidak");
    }
}
