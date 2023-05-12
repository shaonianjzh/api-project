package com.shaonian.apibackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shaonian.apicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author 少年
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-04-16 15:31:56
* @Entity com.shaonian.apibackend.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




