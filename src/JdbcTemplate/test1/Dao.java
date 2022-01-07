package JdbcTemplate.test1;

import java.util.List;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/309:14
 */
public interface Dao {
    //添加方法jdbcTemplate.update
    void add(books books);

    //删除方法jdbcTemplate.update
    void delete(int id);

    //修改方法JdbcTemplate.update
    void update(books books);

    //查询记录个数 queryForObject
    void count();

    //查询某条记录的详细信息queryForObject
    void findOne(int id);

    //查询表中所有记录的详细信息query
    void fineAll();

    //批量添加记录bathUpdate
    void bathadd(List<Object[]> objects);

    //批量修改表中记录
    void bathUpdate(List<Object[]> objects);

    //批量删除表中的记录
    void bathDelete(List<Object []> objects);
}
