package JdbcTemplate;

import JdbcTemplate.Service.BookService;
import JdbcTemplate.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2717:31
 */
public class BookTest {
    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/JDBC.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        Book book = new Book();
        book.setUserId("4");
        book.setUsername("Go语言");
        book.setUstatus("离线");

        bookService.addBook(book);

    }
}
