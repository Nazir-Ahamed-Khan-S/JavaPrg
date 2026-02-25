import java.util.*;
public class FirstClass {
    public static void main(String[] args){
        System.out.println("Enter the value for n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  ans= 0;
        for(int i=1 ; i <= 10  ; i++){
            ans = n * i ;
            System.out.println(n+"*"+i+"="+ans);
        }
        }
    }

