package JdbcTemplate.test1;

import Collection1.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/30/9:14
 */
public class Main {
    @Test
    public void test() {
        books books = new books();
        books.setBookId(2);
        books.setBookname("Python");
        books.setBookCountry("中国");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        books.setBookTime(simpleDateFormat.format(new Date()));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/test1/Book-Config.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        //bookService.add(books);
        //bookService.update(books);
        bookService.delete(2);
    }

    //查询记录总数，单条记录详情以及所有记录详情
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/test1/Book-Config.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.count();
        bookService.countOne(1);
        bookService.countAll();
    }

    //批量添加
    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/test1/Book-Config.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        List<Object[]> list = new ArrayList<>();
        Object[] o1 = {3, "chinese", "中国", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())};
        Object[] o2 = {4, "english", "英国", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())};
        Object[] o3 = {5, "html", "未知", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())};
        Object[] o4 = {6, "maths", "中国", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);

        bookService.bathadd(list);
    }

    //批量修改
    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/test1/Book-Config.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        List<Object []> list = new ArrayList<>();
        Object[] o1 = {"Idea", "广州市", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),0};
        Object[] o2 = {"eclipse", "广州市", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),1};
        Object[] o3 = {"Idea", "深圳市", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),3};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        bookService.bathUpdate(list);
    }
    //批量删除
    @Test
    public  void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/test1/Book-Config.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        List<Object []> list = new ArrayList<>();
        Object[] o1 ={4};
        Object[] o2 ={5};
        list.add(o1);
        list.add(o2);
        bookService.bathDelete(list);

    }
}