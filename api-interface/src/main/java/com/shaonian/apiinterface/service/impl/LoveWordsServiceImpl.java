package com.shaonian.apiinterface.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shaonian.apicommon.model.entity.LoveWords;
import com.shaonian.apiinterface.mapper.LoveWordsMapper;
import com.shaonian.apiinterface.service.LoveWordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
* @author 少年
* @description 针对表【love_words】的数据库操作Service实现
* @createDate 2023-05-26 18:05:25
*/
@Service
public class LoveWordsServiceImpl extends ServiceImpl<LoveWordsMapper, LoveWords> implements LoveWordsService{

    @Resource
    private LoveWordsMapper loveWordsMapper;

    @Override
    public LoveWords getLoveWordsRandom() {
        Random random = new Random();
        int id = random.nextInt(1000);
        return loveWordsMapper.selectById(id);
    }
}




