package interviewbit.math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

class Prime {
    ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p)
                    isPrime[i] = false;
            }
        }
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                result.add(p);
            }
        }
        return result;
    }

    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeSet<Integer> primes = new TreeSet<>(sieve(A));
        for (int prime1 : primes) {
            int remain = A - prime1;
            if (primes.contains(remain)) {
                result.add(prime1);
                result.add(remain);
                break;
            }
        }
        return result;
    }
}