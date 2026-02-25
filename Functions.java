import java.util.*;
public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] atgs){
        System.out.println("Enter the name ");
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();

         printMyName(name);
            }
}