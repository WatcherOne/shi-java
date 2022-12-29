package watchersys.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@TableName(value = "user")
public class User implements Serializable {

    private Integer userId;

    private String username;

    private String nickname;

    private String password;

    private Integer roleId;

    private String icon;

    private Integer sex;

    private Integer status;

    private String email;

    private Integer iphone;
}
