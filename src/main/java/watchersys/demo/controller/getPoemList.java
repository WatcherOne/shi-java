package watchersys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchersys.demo.common.R;
import watchersys.demo.service.PoemService;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class getPoemList {

    @Autowired
    PoemService poemService;

    /**
     * 诗词list取得
     * @return list
     */
    @GetMapping(value = "/poemList")
    public R getList(){
        return poemService.tableList();
    }

    @GetMapping(value = "/test")
    public R test(){
        return poemService.test();
    }


}
