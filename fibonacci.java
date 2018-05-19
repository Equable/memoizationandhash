import java.math.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class fibonacci {



    static Map< Integer, BigInteger> cache = new ConcurrentHashMap<>();
    static {
        BigInteger big0, big1, big2;

        big0 = new BigInteger("0");
        big1 = new BigInteger("1");
        big2 = new BigInteger("2");
        cache.put(0, big0);
        cache.put(1, big1);
        cache.put(2, big2);
    }
    private static BigInteger fib(int x) {

        BigInteger fibmin1, fibmin2, fibresult;

        if (x > 2) {


            fibmin1 = cache.get(x - 1);
            fibmin2 = cache.get(x - 2);
            fibresult = fibmin1.add(fibmin2);
            cache.putIfAbsent(x, fibresult);
            return fibresult;
        }
        else{
            fibresult = cache.get(x);
            return fibresult;
        }
    }





    public static void main(String[] args){
        double start = System.nanoTime();
        for(int n = 1; n <= 1000; n ++){
            System.out.println(n + ":" + fib(n));
        }
        double end = System.nanoTime();
        double totalTime = (end-start)/1000000000;
        NumberFormat nf = new DecimalFormat(".###");
        System.out.println("Run Time: " + nf.format(totalTime) + "s");
    }
}