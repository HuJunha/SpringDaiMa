package JdbcTemplate.Dao;

import JdbcTemplate.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/289:49
 */
@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    String sql = "insert into t_product values(?,?,?)";
    @Override
    public void add(Product product) {
        Object[] args={product.getProductname(),product.getProduct_Id(),product.getProductTime()};

        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
}
