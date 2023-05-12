package com.shaonian.apibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shaonian.apicommon.model.entity.InterfaceInfo;

/**
* @author 少年
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-04-13 21:26:31
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
