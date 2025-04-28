import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with ReviewTester
        double average = 0;
        for(Review rev : allReviews) {
          average += rev.getRating();
        }
        average /= allReviews.length;
        return average;
    }

    public ArrayList<String> collectComments() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with ReviewTester
        ArrayList<String> formatted = new ArrayList<String>();
        for(int i = 0; i < allReviews.length; i ++) {
          if(allReviews[i].getComment().indexOf("!") >= 0) {
            String format = i + "-" + allReviews[i].getComment();
            if(!allReviews[i].getComment().substring(allReviews[i].getComment().length() - 1).equals("!") && !allReviews[i].getComment().substring(allReviews[i].getComment().length() - 1).equals(".")) {
            format += ".";
            }
            formatted.add(format);
          }
       }
       return formatted;
    }
}
