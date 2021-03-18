package watchersys.demo.dao;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import watchersys.demo.entity.User;

import java.util.ArrayList;

@Repository
@Mapper
public interface UserDao {
    ArrayList<User> getUserDetail();
}
