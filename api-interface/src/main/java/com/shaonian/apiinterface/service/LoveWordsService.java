package com.shaonian.apiinterface.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.shaonian.apicommon.model.entity.LoveWords;

/**
* @author 少年
* @description 针对表【love_words】的数据库操作Service
* @createDate 2023-05-26 18:05:25
*/
public interface LoveWordsService extends IService<LoveWords> {

    LoveWords getLoveWordsRandom();

}
