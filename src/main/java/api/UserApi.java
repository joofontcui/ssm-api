package api;

import dto.UserDTO;
import req.UserReq;

/**
 * @author cui jun on 2018/11/14.
 * @version 1.0
 */
public interface UserApi {

    /**
     * 获取用户信息
     * @param req
     * @return
     */
    UserDTO getUserDTO(UserReq req);

}
