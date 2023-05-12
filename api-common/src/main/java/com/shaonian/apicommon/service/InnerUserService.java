package com.shaonian.apicommon.service;


import com.shaonian.apicommon.model.entity.User;

public interface InnerUserService {

    /**
     * 数据库中是否以分配给用户密钥
     *
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
