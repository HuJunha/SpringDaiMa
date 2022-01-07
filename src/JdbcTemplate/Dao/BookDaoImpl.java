package JdbcTemplate.Dao;

import JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2716:43
 */
@Repository
public class BookDaoImpl implements BookDao{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //创建sql语句
    String sql = "insert into t_book values(?,?,?)";
    //添加的方法
    @Override
    public void add(Book book) {
        Object[]args={ book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);

    }
}
