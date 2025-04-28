public class StringPatterns {
    /** Returns the String that results when letter and pattern are
      * compared, as described in part (a)
      *
      * Precondition: letter consists of one uppercase letter.
      *     pattern has at least 2 letters and all letters are uppercase
      *     and unique.
      */
    public static String letterAndPattern(String letter, String pattern) {
        // type your method here
      if(pattern.indexOf(letter) >= 0) {
        int index = pattern.indexOf(letter);
        return pattern.substring(index, index + 1);
      }
      else {
        String out = "";
        for(int i = pattern.length() - 1; i >= 0; i --) {
          out += pattern.substring(i, i + 1);
        }
        return out;
      }
    }
  }
  