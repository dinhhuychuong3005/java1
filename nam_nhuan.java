
import java.util.Scanner;

public class nam_nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("nhap vao nam ban muon kiem tra");
        year = sc.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.println("nam " + year + " la nam nhuan");
        }else {
            System.out.println("nam " + year + "khong phai la nam nhuan");
        }
    }
}
