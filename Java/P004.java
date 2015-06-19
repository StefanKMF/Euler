/* Project Euler problem 4 Solution
 * by Stefan KMF
 * StefanKristoff.ca
*/

import java.util.ArrayDeque;
import java.util.LinkedList;

public class P004 {

  public static void main(String[] args){
    System.out.println(new P004().getNumbers());
  }



  //Gets all of the potential 3 digit numbers to multiply together and feeds them into the isPalindrome checker.
  public int getNumbers(){
    int largest = 0;
    int result;

    for (int x=999; x > 498; x--){
      for (int y=999; y > 498; y--){
        result = x*y;

        String resultString = Integer.toString(result);

        if (isPalindrome(resultString))
          if (result > largest)
            largest = result;
      }
    }
    return largest;
  }



  public boolean isPalindrome(String input){
    /*
     * Implements a deque (double ended queue), by popping off the first and last character simultaneously
     * we can check for equallity and incrementally determine if the string is a palindrome.
     */

    boolean isPali = true;

    ArrayDeque<Character> raw = new ArrayDeque<Character>();

    for (int i = 0; i < input.length(); i++){
      char c = input.charAt(i);
      raw.add(c);
    }

    while (raw.size() > 1 && isPali == true) {
      char first = raw.pollFirst();
      char last = raw.pollLast();
      if (first != last)
        isPali = false;
    }

    return isPali;
  }




}
