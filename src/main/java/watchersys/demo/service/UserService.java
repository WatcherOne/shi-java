package watchersys.demo.service;

import watchersys.demo.common.R;
import watchersys.demo.entity.User;

public interface UserService {
    R login(User params);

    R getUserInfoById(Integer id);

    R getUserList(User params);

    R changeUser(User params);
}
