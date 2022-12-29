package watchersys.demo.service.impl;

import org.springframework.stereotype.Service;
import watchersys.demo.common.R;
import watchersys.demo.mapper.UserDao;
import watchersys.demo.domain.entity.User;
import watchersys.demo.service.UserService;

import java.util.List;

/** 必须要这个注解,表示生成一个构造函数,否则报空指针异常 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

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
        List<User> userList = userDao.getUserList(params);
        return R.success(userList);
    }

    @Override
    public R changeUser(User params) {
        if (params.getUserId() != null) {
            userDao.updateUser(params);
        } else {
            // 给性别默认值
            userDao.addUser(params);
        }
        Integer userId = params.getUserId();
        return R.success(userId);
    }
}
