import java.util.HashMap;
import java.util.Map;

/*The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.*/
class TribonacciSequence {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(tribonacciSeqRecurssion(10));
        System.out.println(tribonacciSeqRecurssion(25));
        System.out.println(tribonacciSeqDP(25));
        System.out.println(map);
    }

    private static int tribonacciSeqRecurssion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return tribonacciSeqRecurssion(n - 1) + tribonacciSeqRecurssion(n - 2) + tribonacciSeqRecurssion(n - 3);
    }

    private static int tribonacciSeqDP(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result;
        if (n == 0) {
            result =  0;
        }else if (n == 1 || n == 2) {
            result =  1;
        } else {
            result = tribonacciSeqDP(n-1)+ tribonacciSeqDP(n-2)+ tribonacciSeqDP(n-3);
        }
        map.put(n, result);
        return result;
    }
}
