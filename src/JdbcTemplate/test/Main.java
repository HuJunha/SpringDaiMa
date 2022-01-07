package JdbcTemplate.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2813:35
 */
public class Main {

    @Test
    public void test() {
        Clothes clothes = new Clothes();
        clothes.setClothesname("nike");
        clothes.setClothesId(1);
        //设置当前时间戳的格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //括号内方法为当前时间转为字符串方法
        clothes.setClothesTime(simpleDateFormat.format(new Date()));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/test/Clothes-Jdbc.xml");
        FactoryService factoryService = (FactoryService) applicationContext.getBean("factoryService");
           //factoryService.add(clothes);//添加方法
          //factoryService.update(clothes);//修改方法
            //factoryService.delete("1");//删除方法
        factoryService.count();//查询个数方法
        factoryService.fineone(2);//根据id查询商品详情
        factoryService.fineAll();
    }

    //批量添加操作的测试
    @Test
    public  void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/test/Clothes-Jdbc.xml");
        FactoryService factoryService = (FactoryService) applicationContext.getBean("factoryService");
        List<Object []> batchArgs = new ArrayList<>();
        Object[] o1 ={"衣服",4,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())};
        Object[] o2 ={"裤子",5,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())};
        Object[] o3 ={"衣服",6,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        factoryService.addAll(batchArgs);
    }
}