/* Project Euler problem 10 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

public class P010{
  public static void main(String[] args){
    System.out.println(new P010().sumPrimes());
  }

  public long sumPrimes(){
    long sum = 0;

    for (long n = 2; n < 2000000; n++){
      if (isPrime(n) == true){
        sum += n;
      }

    }

    return sum;

  }

  public boolean isPrime(long num){
    for (long x=2; x <= Math.sqrt(num); x++){
      if (num % x == 0)
        return false;
    }

    return true;
  }
}
