package dsalld.dsa.DP;
import java.util.*;

public class Fibonacci {
    public HashMap<Integer,Integer> map = new HashMap<>();
    public int fib(int n){
        return rec(n);

    }
    public int rec(int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n ==0)return 0;
        if(n == 1)return 1;
        int ans = rec(n-1)+ rec(n-2);
        map.put(n,ans);
        return ans;
    }

    public static void main(String[] args){
        Fibonacci fibo = new Fibonacci();
        int ans = fibo.fib(10);
        System.out.println(ans);

    }
}



