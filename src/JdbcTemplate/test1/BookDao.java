package JdbcTemplate.test1;

import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/30/9:14
 */
@Repository
public class BookDao implements Dao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加语句
    @Override
    public void add(books books) {
        String sql= "insert into t_book values(?,?,?,?)";
        Object[] args={books.getBookId(),books.getBookname(),books.getBookCountry(),books.getBookTime()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
    //删除方法
    @Override
    public void delete(int id) {
        String sql ="delete from t_book where bookId=?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);

    }
    //修改方法
    @Override
    public void update(books books) {
        String sql = "update t_book set bookname=? ,bookCountry=?, bookTime=? where bookId=? ";
        Object[] args ={books.getBookname(),books.getBookCountry(),books.getBookTime(),books.getBookId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
    //查询表里的记录
    @Override
    public void count() {
        String sql = "select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("表里数据条数是："+integer);
    }

    @Override
    public void findOne(int id) {
        String sql = "select * from t_book where bookId=?";
        books books = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<books>(books.class), id);
        System.out.println(books);
    }

    @Override
    public void fineAll() {
        String sql = "select * from t_book";
        List<books> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<books>(books.class));
        System.out.println(query);
    }
    //批量添加
    @Override
    public void bathadd(List<Object[]> objects) {
        String sql = "insert into t_book values(?,?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println("添加的个数有"+Arrays.toString(ints));
    }
    //批量修改
    @Override
    public void bathUpdate(List<Object[]> objects) {
        String sql = "update t_book set bookname=?,bookCountry=?,bookTime=? where bookId=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(Arrays.toString(ints));
    }
    //批量删除
    @Override
    public void bathDelete(List<Object[]> objects) {
        String sql = "delete  from t_book where bookId=? ";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(Arrays.toString(ints));
    }
}
