public class Operator {
    /** IMPLEMENTATION PROVIDED TO ENABLE TESTING */
    public static int transform(String str) {
        if (str.equals("orang")) {
          return 2;
        } else if (str.equals("epear")) {
          return 6;
        } else if (str.equals("bl")) {
          return 5;
        } else if (str.equals("ah")) {
          return 4;
        } else {
          return 0;
        }
    }
  
    /** Returns an integer based on two input strings, as described in part (a)
      *
      * Precondition: input and op are not null.
      *               The length of input is even.
      *               op is either "$$", "^^", or "##".
      */
      public static int compute(String input, String op) {
        // type your method here
        String a = input.substring(0, input.length() / 2);
        String b = input.substring(input.length() / 2);
        if(op.equals("$$")) {
          return transform(a) + transform(b);
        }
        else if(op.equals("^^")) {
          return transform(a) * transform(b);
         }
        else {
          return transform(a) - transform(b);
        }
        
      }
  }
  