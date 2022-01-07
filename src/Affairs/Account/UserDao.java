package Affairs.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/319:42
 */
@Repository
public class UserDao implements Dao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addMoney(Account account) {
        String sql ="update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,account.getMoney(),account.getUsername());
        System.out.println(account.getUsername()+"转账成功，添加的金额是："+account.getMoney());
    }

    @Override
    public void reduceMoney(Account account) {
        String sql = "update t_account set money = money - ? where username=?";
        jdbcTemplate.update(sql, account.getMoney(), account.getUsername());//带入的参数顺序要与sql语句一致，否则添加减少不了
        System.out.println(account.getUsername() + "转账成功，减少的金额是：" + account.getMoney());
    }
}
