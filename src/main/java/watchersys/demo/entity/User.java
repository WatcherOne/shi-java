package watchersys.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable {

    private Integer userId;

    private String username;

    private String nickname;

    private String password;

    private Integer roleId;
}
