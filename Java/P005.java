/* Project Euler problem 5 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

public class P005 {

  public static void main(String[] args){
    System.out.println(new P005().smallestMulti());
  }


  public int smallestMulti(){
    /*
     * Reduce calcuations by starting at 20, and increasing by 20 after each loop. This ensures that 20
     * is a factor and that we reduce the number of calcuations by 20.
     */

    boolean found = false;
    int num = 20;

    while (found == false){
      boolean isDivisible = true;

      for (int x = 2; x < 20; x++){
        if (num % x != 0)
          isDivisible = false;
      }

      if (isDivisible == true){
        found = true;
        break;
      }

      num += 20;

    }

    return num;
  }

}
