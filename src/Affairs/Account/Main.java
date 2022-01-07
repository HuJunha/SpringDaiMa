package Affairs.Account;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/3110:19
 */
public class Main {
    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Affairs/Account/Account-Config.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        Account account = new Account();
        account.setMoney(1000);
        account.setUsername("lucy");

        Account account1 = new Account();
        account1.setUsername("mary");
        account1.setMoney(1000);

        userService.account(account, account1);
    }
}
