package JdbcTemplate.entity;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/27/17:03
 */
public class Book {
    private  String userId;
    private  String username;
    private  String ustatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
