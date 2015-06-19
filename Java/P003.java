/* Project Euler problem 3 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

public class P003 {

  public static void main(String[] args){
    System.out.println(new P003().largestPrimeFactor(600851475143L));
  }

  public long largestPrimeFactor(long num){
    long largest = 0;
    for (long x = 1; x < Math.sqrt(num); x = x + 2){ //Skip all even numbers as we are only looking for Prime Factors
      if (num % x == 0)
        if (isPrime(x))
          largest = x; //Since X is naturally increasing, the newest value of x will be the largest.
          System.out.println(x);
    }

    return largest;

  }

  public boolean isPrime(long num){
    for (long x = 3; x < Math.sqrt(num); x = x + 2){ //Start at 3 since we already eliminated all even numbers.
      if ((num % x) == 0)
        return false;
    }

    return true;
  }
}
