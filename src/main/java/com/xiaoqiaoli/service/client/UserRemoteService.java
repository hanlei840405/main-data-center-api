package com.xiaoqiaoli.service.client;

import com.xiaoqiaoli.dto.UserDTO;

/**
 * Created by hanlei6 on 2016/7/14.
 */
public interface UserRemoteService {
    UserDTO remoteGet(String id);
}
