package watchersys.demo.controller;

import org.springframework.web.bind.annotation.*;
import watchersys.demo.common.R;
import watchersys.demo.domain.entity.User;
import watchersys.demo.service.UserService;

@RestController
@RequestMapping("api")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

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

    @PostMapping("/changeUser")
    public R addUser(@RequestBody User params) {
        return userService.changeUser(params);
    }
}
