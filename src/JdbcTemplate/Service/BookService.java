package JdbcTemplate.Service;

import JdbcTemplate.Dao.BookDao;
import JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2716:41
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }
}
