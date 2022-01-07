package Affairs.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/319:42
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private  Dao dao;

    public void account(Account account,Account account1){

            dao.reduceMoney(account);
            int i = 100/0;
            dao.addMoney(account1);

    }
}
