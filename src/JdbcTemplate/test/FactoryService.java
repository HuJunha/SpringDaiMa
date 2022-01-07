package JdbcTemplate.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.IdentityHashMap;
import java.util.List;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2813:34
 */
@Service
public class FactoryService {
    @Autowired
    private ClothesDao clothesDao;
    //添加
    public void add(Clothes clothes){
        clothesDao.add(clothes);
    }
    //修改
    public void update(Clothes clothes){
        clothesDao.update(clothes);
    }
    //删除
    public void delete(String id){
        clothesDao.delete(id);
    }
    //查询个数
    public void count(){
        int count = clothesDao.count();
        System.out.println("对应表的数据个数为："+count);
    }
    //查询返回对象
    public  void fineone(int id){
        Object fineone = clothesDao.fineone(id);
        System.out.println(fineone);
    }

    //查询返回所有对象用集合表示
    public  void fineAll(){
        clothesDao.fineAll();
    }

    //批量添加操作
    public void addAll(List<Object []> bathArgs){
        clothesDao.addAll(bathArgs);
    }
}
