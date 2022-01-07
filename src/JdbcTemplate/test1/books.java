package JdbcTemplate.test1;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/3010:57
 */
public class books {
    private int bookId;
    private  String bookname;
    private  String  bookCountry;
    private  String bookTime;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookCountry() {
        return bookCountry;
    }

    public void setBookCountry(String bookCountry) {
        this.bookCountry = bookCountry;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }

    @Override
    public String toString() {
        return "books{" +
                "bookId=" + bookId +
                ", bookname='" + bookname + '\'' +
                ", bookCountry='" + bookCountry + '\'' +
                ", bookTime='" + bookTime + '\'' +
                '}';
    }

}
