import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
//import org.json.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // find max profit.
//        int[] prices1 = {6, 3, 1, 2, 5, 4};
//        int[] prices2 = {8, 5, 3, 1};
//        System.out.println(solution(prices2));

//        int[] startTime = {13, 24, 5};
//        int[] finishTime = {13, 24, 20};
//        System.out.println(Arrays.toString(solution(startTime, finishTime)));
//        String inputString = "aabb";
//        System.out.println(solution(inputString));
//

        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", "Ömer");
        hm.put("surname", "Okumuş");
        hm.put("age", "25");
        hm.put("school", "Marmara");
        hm.put("department", "CSE");
        hm.put("program", "Master");

//        JSONObject jo = new JSONObject(hm);
//        System.out.println(jo);
//
//        PrintWriter pw = new PrintWriter("myjs.json");
//        String js = jo.toString();
//        System.out.println(js);
//        pw.write(jo.toString());
//        pw.flush();
//        pw.close();



    }

    public static void format(double d) {
        // 1- ondalık basamak kontrolü
        // 2- format işlemini gerçekleştir
    }
    static boolean solution(String inputString){
        int len = inputString.length();
        if (len % 2 == 0){
            for (int i = 0; i < len; i++) {
                if (!doesDuplicateExist(inputString, inputString.charAt(i))){
                    return false;
                }
            }
        } else {
            int nonDuplicateCount = 0;
            for (int i = 0; i < len; i++) {
                if (!doesDuplicateExist(inputString, inputString.charAt(i)))
                    nonDuplicateCount++;
            }
            return nonDuplicateCount == 1;
        }
        return true;

    }

    static boolean doesDuplicateExist(String inputString, char ch){
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ch)
                count++;
        }
        return count % 2 == 0;
    }

//    static int solution(int[] prices) {
//        int min = 0, sub;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i; j < prices.length; j++) {
//                sub = prices[i] - prices[j];
//                if (sub < min)
//                    min = sub;
//            }
//        }
//        return -min;
//    }

//    static int[] solution(int[] startTime, int[] finishTime) {
//        int[] digitCounts = new int[10];
//        for (int i = startTime[0]; i <= finishTime[0]; i++) {
//            for (int j = startTime[1]; j <= finishTime[1]; j++) {
//                if (startTime[0] == finishTime[0] && startTime[1] == finishTime[1]) {
//                    for (int k = startTime[2]; k <= finishTime[2]; k++) {
//                        countDigits(k, digitCounts);
//                        countDigits(j, digitCounts);
//                        countDigits(i, digitCounts);
//                    }
//                } else {
//                    for (int k = 0; k < 60; k++) {
//                        countDigits(k, digitCounts);
//                        countDigits(j, digitCounts);
//                        countDigits(i, digitCounts);
//                    }
//                }
//            }
//        }
//        return digitCounts;
//    }
//
//    static void countDigits(int n, int[] digitCounts) {
//        String number = n + "";
//        if (number.length() == 1) {
//            digitCounts[n]++;
//            digitCounts[0]++;
//        } else {
//            int digit0 = n % 10;
//            int digit1 = (n / 10) % 10;
//            digitCounts[digit0]++;
//            digitCounts[digit1]++;
//        }
//    }

}
