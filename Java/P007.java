/* Project Euler problem 7 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

import java.util.Arrays;

public class P007{

  public static void main(String[] args){
    System.out.println(new P007().getPrime(10001));
  }

  public long getPrime(int num){
    int[] oldPrimes;

    oldPrimes = new int[num];
    oldPrimes[0] = 2;

    int primeCounter = 1;
    int newPrime = 3; //Start at 3 since we know 2 is prime and already in list of Primes.

    while (primeCounter < num){

      if (isPrime(newPrime) == true){
        primeCounter++;
        oldPrimes[primeCounter-1] = newPrime;
      }

      newPrime += 2;
    }
  return oldPrimes[num-1];

  }

  public boolean isPrime(int num){
    for (int x=2; x <= Math.sqrt(num); x++){
      if (num % x == 0)
        return false;
    }

    return true;
  }

}
