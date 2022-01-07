package JdbcTemplate.test;

import java.util.List;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2813:34
 */
public interface ClothesDao {
    //添加方法
    void add(Clothes clothes);
    //删除方法
    void delete(String  id);
    //修改方法
    void update(Clothes clothes);
    //查询表中数据总数方法
    int count();
    //查询返回对象
    Clothes fineone(int id);
    //查询返回所有对象并用集合展现出来
    void fineAll();
    //批量添加的方法
    void addAll(List<Object[]> batchArgs);
}
