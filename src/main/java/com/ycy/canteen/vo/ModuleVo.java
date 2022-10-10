package com.ycy.canteen.vo;

import com.ycy.canteen.entities.PostEntity;
import com.ycy.canteen.entities.SysEdition;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ModuleVo implements PostEntity {

    /**
     * 模块名称
     */
    private String module;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 子模块
     */
    private List<SysEdition> list = new ArrayList<>();

}
