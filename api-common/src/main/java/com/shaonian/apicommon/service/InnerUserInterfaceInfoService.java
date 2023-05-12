package com.shaonian.apicommon.service;


/**
* @author 少年
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-04-16 15:31:56
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

    boolean isHaveCount(Long interfaceInfoId,Long userId);
}
