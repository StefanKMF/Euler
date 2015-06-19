/* Project Euler problem 1 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

public class P001 {

  public static void main(String[] args) {
    System.out.println(solution());
  }

  public static int solution() {
    int sum = 0;
    for (int x = 0; x < 1000; x++){
      if ( x % 3 == 0 || x % 5 == 0)
        sum += x;
    }

    return sum;
  }
}
