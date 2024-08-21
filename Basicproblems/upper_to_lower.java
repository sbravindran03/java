package Basicproblems;

import java.util.Arrays;

public class upper_to_lower {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'c', 'k', 'm', '$', '#' };
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] += 32;// for changing upper case to lower case is +32
            else if (ch[i] >= 'a' && ch[i] <= 'z')
                ch[i] -= 32;// for changing lower case to upper is -32

        }
        System.out.println(Arrays.toString(ch));
    }

}
