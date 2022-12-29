package watchersys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchersys.demo.common.R;
import watchersys.demo.service.IconService;

@RestController
@RequestMapping("api")
public class IconController {

    // 以下注解必须有，否则会报空指针异常
    @Autowired
    IconService iconService;

    @GetMapping("/getIconList")
    public R getIconList() {
        return iconService.getList();
    }
}
