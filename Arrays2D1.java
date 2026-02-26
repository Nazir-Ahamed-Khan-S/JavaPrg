import java.util.*;
public class Arrays2D1{
    public static void main(String[] args){
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int row =   sc.nextInt();
        int column = sc.nextInt();

        int numbers[][] = new int [row][column];
        
        System.out.println("Enter the array elements:");

        for(int i=0 ; i<row ; i++){
            for( int j=0 ; j<column ; j++){
                numbers[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Elemnt to find:");
        int x = sc.nextInt();

        for(int i =0 ; i<row ; i++){
            for (int j=0 ; j<column ; j++){
               if(numbers[i][j]==x){
                System.out.println("x is found at:"+i+ ","+j);
               }
            }
        }
    }
}
