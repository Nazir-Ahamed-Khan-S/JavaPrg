import java.util.*;

public class FunctionSum {
    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value for a and b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Sum(a, b);
        System.out.println(sum);
    }
}