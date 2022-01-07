package Collection1;

import java.util.List;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/7/11:37
 */
public class Book {
    private  String name;
    private  List<Book>list;
    public Book() {

    }

    public Book(String name, List<Book> list) {
        this.name = name;
        this.list = list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public  void talk(){
        System.out.println(list);
    }


}
