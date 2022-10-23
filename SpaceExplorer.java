import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SpaceExplorer {
    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        int count = 0;
        int size = 3;

        List<String> ret = new ArrayList<>();

        for (int start = 0; start < s.length(); start += size) {
            ret.add(s.substring(start, Math.min(s.length(), start + size)).trim());
        }

        for (int i = 0; i < ret.size(); i++) {
            if (!"SOS".equalsIgnoreCase(ret.get(i))) {
                if (!"S".equalsIgnoreCase(String.valueOf(ret.get(i).charAt(0)))) {
                    count++;
                }
                if (!"O".equalsIgnoreCase(String.valueOf(ret.get(i).charAt(1)))) {
                    count++;
                }
                if (!"S".equalsIgnoreCase(String.valueOf(ret.get(i).charAt(2)))) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int result = marsExploration(s);
        bufferedReader.close();
        System.out.println(result);
    }
}


