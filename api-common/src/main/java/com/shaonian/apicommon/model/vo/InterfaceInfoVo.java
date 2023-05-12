package com.shaonian.apicommon.model.vo;

import com.shaonian.apicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVo extends InterfaceInfo {


    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}
