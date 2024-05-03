package HW4;
public class Shop {
    public static void main(String[] args) {
        System.out.println("Product №1: smartphone,");
        int d = 5;
        double p = 958.86;
        String a = String.format("total sales for %d days is EUR %f,", d, p);
        System.out.println(a);
        double c = p/d;
        String b = String.format("sales by day is EUR %.2f.", c);
        System.out.println(b);

        System.out.println();

        System.out.println("Product №2: laptop,");
        int d2 = 7;
        double p2 = 3714.58;
        System.out.printf("total sales for %d days is EUR %f,", d2, p2);
        double c2 = p2/d2;
        System.out.printf("sales by day is EUR %.2f.", c2);

    }
}
