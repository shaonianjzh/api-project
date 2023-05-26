package com.shaonian.apiinterface.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shaonian.apicommon.model.entity.LoveWords;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 少年
* @description 针对表【love_words】的数据库操作Mapper
* @createDate 2023-05-26 18:05:25
* @Entity com.shaonian.apicommon.model.entity.LoveWords
*/
@Mapper
public interface LoveWordsMapper extends BaseMapper<LoveWords> {

}




