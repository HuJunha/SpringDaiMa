package JdbcTemplate.Service;

import JdbcTemplate.Dao.ProductDao;
import JdbcTemplate.entity.Product;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/28/9:47
 */
@Service
public class ProductService {
    @Autowired
    private  ProductDao productDao;
    public void  addProduct(Product product){
        productDao.add(product);
    }
}
