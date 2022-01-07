package Collection1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/7/9:55
 */
public class Collection {
    private String[] arr;
    private List<String> list;
    private Set<String>set;
    private Map<String,String>map;
    private Map<String,Book>map1;
    private List<Book>list1;

    public void setList1(List<Book> list1) {
        this.list1 = list1;
    }

    public void setMap1(Map<String, Book> map1) {
        this.map1 = map1;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void tell(){
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(map1);
        System.out.println(list1);
    }


}
