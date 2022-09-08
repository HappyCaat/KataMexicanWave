import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        wave(" two words ");
    }
    public static String[] wave(String str) {
        char[] chararray = str.toCharArray();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i] == ' ' && i != 0) {
                chararray[i - 1] = Character.toLowerCase(chararray[i - 1]);
            }
            if (chararray[i] == ' ') {
                continue;
            }

            chararray[i] = Character.toUpperCase(chararray[i]);
            if (i >= 1) {
                chararray[i - 1] = Character.toLowerCase(chararray[i - 1]);
            }
            String string = String.copyValueOf(chararray);
            list.add(string);

        }
        String[] result = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(result));
        return new String[]{};
    }
}
