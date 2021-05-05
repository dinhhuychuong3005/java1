import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so tien usd");
        usd = sc.nextDouble();
        double result;
        result = vnd * usd;
        System.out.println("gia tri vnd tuong ung la : " + result);
    }
}
