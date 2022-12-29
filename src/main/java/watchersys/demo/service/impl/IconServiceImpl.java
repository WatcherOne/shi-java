package watchersys.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import watchersys.demo.common.R;
import watchersys.demo.domain.entity.Icon;
import watchersys.demo.mapper.IconMapper;
import watchersys.demo.service.IconService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class IconServiceImpl implements IconService {

    @Autowired
    IconMapper iconMapper;

    @Override
    public R getList() {
        List<Icon> list = iconMapper.selectList(null);
        Map<String, List<Icon>> resultList = list.stream().collect(Collectors.groupingBy(Icon::getIconType));
        return R.success(resultList);
    }
}
