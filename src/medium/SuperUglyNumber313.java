package medium;
/**
 * Write a program to find the nth super ugly number.
 * Super ugly numbers are positive numbers whose all prime factors are 
 * in the given prime list primes of size k. For example, 
 * [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] is the sequence of the 
 * first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4. 
 * Note:
(1) 1 is a super ugly number for any given primes.
(2) The given numbers in primes are in ascending order.
(3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000. 
(4) index n is NOT zero-based.
 *
 */
public class SuperUglyNumber313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n==1)return 1;
        int[] multiple=new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            primes[i]=1;
        }
        int target=2;
        int res=primes[0];
        while(target<=n){
        }
        return res;//unfinished
    }
    public static void main(String[] args) {

    }

}
