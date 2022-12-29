package watchersys.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import watchersys.demo.domain.entity.User;
import java.util.ArrayList;

@Repository
@Mapper
public interface UserDao {

    User login(@Param("params") User params);

    User getUserInfoById(Integer id);

    ArrayList<User> getUserList(@Param("params") User params);

    Integer addUser(@Param("params") User params);

    Integer updateUser(@Param("params") User params);
}
