package JdbcTemplate.entity;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/289:42
 */
public class Product {
    private String productname;
    private  String   product_Id;
    private  String   productTime;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(String product_Id) {
        this.product_Id = product_Id;
    }

    public String getProductTime() {
        return productTime;
    }

    public void setProductTime(String productTime) {
        this.productTime = productTime;
    }
}
