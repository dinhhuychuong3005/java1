import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("nhap vao can nang");
        weight = sc.nextDouble();
        System.out.println("nhap vao chieu cao");
        height = sc.nextDouble();
        bmi = weight/(Math.pow(height,2));
        if (bmi<18.5){
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("Normal");
        }else if (bmi < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
