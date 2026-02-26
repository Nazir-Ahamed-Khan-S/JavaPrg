import java.util.*;
public class String2{
    public static void main(String[] args){
        String name1 = "tony";
        String name2 = "tony";

        /* s1 >  s2 = : + value;
           s1 == s2 = : 0 ;
           s1 < s2  = : - value:
        */   

           if(name1.compareTo(name2) ==0){
            System.out.println("String are equal");
           } else {
            System.out.println("Strings are not equal");
           }
        }
}