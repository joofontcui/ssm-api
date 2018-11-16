package req;

import java.io.Serializable;

/**
 * @author cui jun on 2018/11/14.
 * @version 1.0
 */
public class UserReq implements Serializable {

    private Integer id ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserReq{" +
                "id=" + id +
                '}';
    }
}
