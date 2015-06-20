/* Project Euler problem 6 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

public class P006{

  public static void main(String[] args){
    System.out.println(new P006().squareDifference());
  }

  public long squareDifference(){
    long sumSquares = 0;
    long squareSum = 0;
    for (long x=1; x <= 100; x++){
      sumSquares += Math.pow(x,2l);
      squareSum += x;
    }

    squareSum = squareSum*squareSum;

    return (squareSum - sumSquares);
  }

}
