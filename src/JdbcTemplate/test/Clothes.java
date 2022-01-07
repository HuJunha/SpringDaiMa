package JdbcTemplate.test;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2813:35
 */
public class Clothes {
    private  String clothesname;
    private  int  clothesId;
    private  String clothesTime;

    public String getClothesname() {
        return clothesname;
    }

    public void setClothesname(String clothesname) {
        this.clothesname = clothesname;
    }

    public int getClothesId() {
        return clothesId;
    }

    public void setClothesId(int clothesId) {
        this.clothesId = clothesId;
    }

    public String getClothesTime() {
        return clothesTime;
    }

    public void setClothesTime(String clothesTime) {
        this.clothesTime = clothesTime;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "clothesname='" + clothesname + '\'' +
                ", clothesId=" + clothesId +
                ", clothesTime='" + clothesTime + '\'' +
                '}';
    }
}
