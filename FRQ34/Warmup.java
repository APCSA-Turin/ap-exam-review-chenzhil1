

import java.util.ArrayList;

public class Warmup {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(10);
        nums.add(3);
        nums.add(8);
        nums.add(6);
        nums.add(9);

        // WRITE CODE HERE
        for(int i = 0; i < nums.size(); i ++ ) {
            if(nums.get(i) % 2 == 1) {
            nums.add(i, 2);
            i ++;
            }
        }

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(5);
        nums2.add(2);
        nums2.add(7);
        nums2.add(9);
        nums2.add(6);
        nums2.add(1);
// WRITE CODE HERE
        for(int i = 0; i < nums2.size(); i ++) {
            if(nums2.get(i) % 2 == 1) {
            nums2.remove(i);
            i --;
            }
        }

        String[][] words = new String[2][3];
        words[0][1] = "hello";
        words[0][2] = "echo";
        words[1][0] = "eek";
        words[1][2] = "plea";

        // WRITE CODE HERE
        for(int i = 0; i < words.length; i ++) {
            for(int j = 0; j < words[i].length; j ++) {
            if(words[i][j].substring(0,1).equals("e")) {
                words[i][j] = "CSA";
            }
            }
        }
  

    }
}
