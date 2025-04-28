public class StringAnalyzer {
    /** Returns a count of how many times smallStr occurs in largeStr, as
      * described in part (a)
      *
      * Precondition: largeStr is not null; smallStr is not null.
      *          The length of smallStr is less than the length of largeStr.
      */
     public static int countRepeat(String largeStr, String smallStr) {
       // type your method here
       int count = 0;
       for(int i = 0; i <= largeStr.length() - smallStr.length(); i ++) {
         if(largeStr.substring(i, i + smallStr.length()).equals(smallStr)) {
           count ++;
           i = i + smallStr.length() - 1;
         }
       }
     return count;
    }
  }
  