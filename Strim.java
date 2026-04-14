public class Strim {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = str.toUpperCase();
        System.out.println(str2);

        // lowercase
        String str3 = str.toLowerCase();
        System.out.println(str3);

        // string trim
        String input = "   This is a string with spaces.   ";
        String trimmed = input.trim();
        System.out.println(trimmed);
    }
}