package com.shaonian.apibackend.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shaonian.apibackend.mapper.UserInterfaceInfoMapper;
import com.shaonian.apibackend.service.UserInterfaceInfoService;
import com.shaonian.apicommon.model.entity.UserInterfaceInfo;
import com.shaonian.apicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId,userId);
    }

    @Override
    public boolean isHaveCount(Long interfaceInfoId,Long userId) {

        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("interfaceInfoId",interfaceInfoId);
        wrapper.eq("userId",userId);
        UserInterfaceInfo userInterfaceInfo = userInterfaceInfoMapper.selectOne(wrapper);
        if(userInterfaceInfo==null){
            return false;
        }
        return userInterfaceInfo.getLeftNum()>0;
    }
}
