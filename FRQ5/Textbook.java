public class Textbook extends Book{
  private int edition;
  public Textbook(String bookTitle, double bookPrice, int edition) {
    super(bookTitle, bookPrice);
    this.edition = edition;
  }
  public String getBookInfo() {
    return super.getBookInfo() + "-" + edition;
  }
  public int getEdition() {
    return edition;
  }
  public boolean canSubstituteFor(Textbook another) {
    if(this.getTitle().equals(another.getTitle()) && this.getEdition() >= another.getEdition()) {
      return true;
    }
    return false;
  }
}
