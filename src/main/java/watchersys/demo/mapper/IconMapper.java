package watchersys.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import watchersys.demo.domain.entity.Icon;

@Repository
@Mapper
public interface IconMapper extends BaseMapper<Icon> {
}
