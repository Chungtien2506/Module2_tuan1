import java.util.Scanner;

public class tiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so tien USD:");
        usd = sc.nextDouble();
        double quydoi = usd *23000;
        System.out.println("Gia tri VND :" + quydoi);
    }
}
