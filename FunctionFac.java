import java.util.*;
public class FunctionFac{
    public static void  printFactorial(int n){
        if(n < 0){
            System.out.println("invalid value");
            return ;
        }
        int factorial = 1;
        for(int i=n; i>=1 ; i--){
            factorial = factorial*i;
        }
          System.out.println(factorial); 
          return;
    }
public static void main(String[] args){
    System.out.println("Enter the value for n:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printFactorial(n);   
}
}