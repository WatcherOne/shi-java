package watchersys.demo.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import watchersys.demo.common.R;
import watchersys.demo.dao.UserDao;
import watchersys.demo.entity.User;
import watchersys.demo.service.UserService;

import java.util.ArrayList;

@Service
/** 必须要这个注解,表示生成一个构造函数,否则报空指针异常 */
@AllArgsConstructor
public class UserServicelmpl implements UserService {

    private UserDao userDao;

    @Override
    public R login(User params) {
        User user = userDao.login(params);
        if (user == null) {
            return R.error("账号错误");
        } else {
            return R.success(user);
        }
    }

    @Override
    public R getUserInfoById(Integer id) {
        User user = userDao.getUserInfoById(id);
        return R.success(user);
    }

    @Override
    public R getUserList(User params) {
        ArrayList<User> userList = userDao.getUserList(params);
        return R.success(userList);
    }
}
