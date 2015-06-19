/* Project Euler problem 2 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

public class P002 {
  public static void main(String[] args){
    System.out.println(new P002().fibonacci());
  }

  public int fibonacci() {
    int sum = 0;
    int f1,f2;
    f1 = f2 = 1;
    int temp = 0;

    while (f2 < 4000000){
      temp = f1 + f2;
      f1 = f2;
      f2 = temp;
      if (f1 % 2 == 0)
        sum += f1;
    }

    return sum;
  }
}
