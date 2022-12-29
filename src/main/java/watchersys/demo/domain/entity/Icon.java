package watchersys.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@TableName(value = "icon_set")
public class Icon implements Serializable {
    private Integer id;

    private String iconName;

    private String iconCode;

    private String iconType;
}
