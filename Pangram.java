import java.io.*;
import java.util.*;


public class Pangram {
    public static final int ALPHABET_COUNT = 26;

    public static String pangrams(String s) {
        if (s == null) {
            return "not pangram";
        }

        Boolean[] alphabetMaker = new Boolean[ALPHABET_COUNT];
        Arrays.fill(alphabetMaker, false);
        int alphabetIndex = 0;
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                alphabetIndex = s.charAt(i) - 'A';
                alphabetMaker[alphabetIndex] = true;
            }
        }

        for (Boolean index:
                alphabetMaker) {
            if (!index) {
                return "not pangram";
            }
        }
        return "pangram";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = pangrams(s);
        System.out.println(result);
        bufferedReader.close();
    }
}

