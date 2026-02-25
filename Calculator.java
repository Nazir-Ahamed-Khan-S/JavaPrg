import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the operation:");
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.print(a + b);
                break;
            case 2: System.out.print(a - b);
                break;
            case 3: System.out.print(a * b);
                break;
            case 4: System.out.print(a / b);
                break;
            case 5: System.out.print(a % b);
                break;
            default: System.out.print("Invalid");
        }
    }
}
