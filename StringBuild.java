import java.util.*;
public class StringBuild{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'p');
        System.out.println(sb);
    
        sb.insert(0, 's');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.append(" stark");
        System.out.println(sb);

        System.out.println(sb.length());
    }

}