package Recursion;

import java.util.*;

public class StringCharCount {

    public static int CountChar(String str, char c) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = 0;
        if (str.charAt(0) == c) {
            count++;
        }
        int smallAns = CountChar(str.substring(1), c);
        count = count + smallAns;
        return count;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter String ==>");
        String str = s.nextLine();

        System.out.print("Enter Character you want to find into String ==>");
        char c = s.next().charAt(0);

        int ans = CountChar(str, c);
        System.out.println("In String " + str + " are repleated character " + c + " is " + ans + " Times.");
    }

}
