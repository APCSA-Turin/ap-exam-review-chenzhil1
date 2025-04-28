
public class CombinedTable {
  private int seats;
  private double desirability;
  private SingleTable t1;
  private SingleTable t2;
  public CombinedTable(SingleTable t1, SingleTable t2) {
    this.t1 = t1;
    this.t2 = t2;
    seats = t1.getNumSeats() + t2.getNumSeats() - 2;
    desirability = (t1.getViewQuality() + t2.getViewQuality()) / 2;
    if(t1.getHeight() != t2.getHeight()) {
      desirability -= 10;
    } 
  }
  public boolean canSeat(int people) {
    if(people > seats) {
        return false;
      }
      else { 
        return true;
      }
    }
  public double getDesirability() {
    desirability = (t1.getViewQuality() + t2.getViewQuality()) / 2;
    if(t1.getHeight() != t2.getHeight()) {
      desirability -= 10;
    }
    return desirability;
  }
}
