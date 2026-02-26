import java.util.*;
public class Arrays1{
    public static void main(String[] args){
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0 ; i<size ; i ++){
            numbers[i] = sc.nextInt();
        }

         int x = sc.nextInt();
         boolean found = false; 

        for(int i=0 ; i<numbers.length ; i++){
            if(numbers[i] == x){
            System.out.print("x is found at:"+i);
            found = true;
            break;
            }
        }
            if( found == false){
            System.out.println("not found");
        }
    }
}