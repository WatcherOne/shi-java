package watchersys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import watchersys.demo.common.R;
import watchersys.demo.entity.User;
import watchersys.demo.service.UserService;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public R login(User params) {
        return userService.login(params);
    }

    @GetMapping("/getUserInfo/{id}")
    public R getUserInfoById(@PathVariable("id") Integer id) {
        return userService.getUserInfoById(id);
    }

    @GetMapping("/getUserList")
    public R getUserList(User params) {
        return userService.getUserList(params);
    }
}
