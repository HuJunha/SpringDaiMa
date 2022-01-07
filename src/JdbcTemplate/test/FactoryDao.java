package JdbcTemplate.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/28/13:34
 */
@Repository
public class FactoryDao implements ClothesDao{
    //创建jdbcTemplate的实例
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //添加方法
    @Override
    public void add(Clothes clothes) {
        String sql = "insert into t_clothes values(?,?,?)";
        Object[] args={clothes.getClothesname(),clothes.getClothesId(),clothes.getClothesTime()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
    //删除方法

    @Override
    public void delete(String Id) {
        String sql = "delete from t_clothes where clothesId=?";
        int update = jdbcTemplate.update(sql, Id);
        System.out.println(update);

    }
    //修改方法

    @Override
    public void update(Clothes clothes) {
        String sql = "update  t_clothes set clothesname=? , clothesTime=? where clothesid=? ";
        Object[] args={clothes.getClothesname(),clothes.getClothesTime(),clothes.getClothesId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
    //查询表中总记录的方法
    @Override
    public int count() {
        String sql ="select count(*) from t_clothes";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
    //根据id查询表中物品详情
    @Override
    public Clothes fineone(int clothesId) {
        String sql ="select * from t_clothes where clothesId=?";
        Clothes clothes = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Clothes>(Clothes.class), clothesId);
        return  clothes;
    }
    //查询所有物品详情，并用集合表示
    @Override
    public void fineAll() {
        String sql = "select * from t_clothes";
        List<Clothes> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Clothes>(Clothes.class));
        System.out.println(query);
    }


    //批量添加操作
    @Override
    public void addAll(List<Object[]> batchArgs) {
        String sql ="insert into t_clothes values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }


}
