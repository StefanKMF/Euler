/* Project Euler problem 9 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

public class P009 {

  public static void main (String[] args){
    System.out.println(new P009().pythagorean());
  }


  public int pythagorean(){
    int product = 0;

    for (int a = 1; a < 1000; a++){
      for (int b = a + 1; b < 1000; b++){
        int c = 1000 - (a + b);
        if (a + b +c == 1000){
          if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
            product = a * b * c;
        }
      }
    }

    return product;

  }


}
