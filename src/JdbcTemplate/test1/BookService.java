package JdbcTemplate.test1;

import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/309:14
 */
@Service
public class BookService {
    @Autowired
    private  Dao dao;

    public void add(books books){
        dao.add(books);
    }
    public void delete(int id){
        dao.delete(id);
    }
    public  void update(books books){
        dao.update(books);
    }
    public void count(){
        dao.count();
    }
    public  void countOne(int id){
        dao.findOne(id);
    }
    public  void  countAll(){
        dao.fineAll();
    }
    public  void bathadd(List<Object[]> objects){
        dao.bathadd(objects);
    }
    public  void bathUpdate(List<Object[]> objects){
        dao.bathUpdate(objects);
    }
    public void bathDelete(List<Object []>objects){
        dao.bathDelete(objects);
    }

}
