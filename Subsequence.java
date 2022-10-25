import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Subsequence {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {

        String referenceString = "hackerrank";
        char[] arrayStringRef = referenceString.toCharArray();
        char[] arrayString = s.toCharArray();
        int count = 0;

        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i] == arrayStringRef[count]) {
                count++;
                if (count == referenceString.length()) {
                    return "YES";
                }
            }
        }

        System.out.println(count);
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();
                String result = hackerrankInString(s);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
    }
}