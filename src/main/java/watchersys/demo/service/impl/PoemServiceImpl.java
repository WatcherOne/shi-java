package watchersys.demo.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import watchersys.demo.common.R;
import watchersys.demo.dao.UserDao;
import watchersys.demo.entity.User;
import watchersys.demo.service.PoemService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
/** 必须要这个注解,表示生成一个构造函数,否则报空指针异常 */
@AllArgsConstructor
public class PoemServiceImpl implements PoemService {

    private UserDao userDao;

    @Override
    public R tableList() {
        ArrayList<Object> lists = new ArrayList<Object>();
        Map<String, String> item = new HashMap<String, String>();
        item.put("age", "13");
        lists.add(item);
        return R.success(lists).add("total", 100).add("page", 3);
    }
}
