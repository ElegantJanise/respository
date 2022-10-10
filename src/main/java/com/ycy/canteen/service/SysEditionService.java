package com.ycy.canteen.service;

import com.ycy.canteen.entities.SysEdition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ycy.canteen.vo.ModuleVo;

import java.util.List;

/**
 * <p>
 * 版本表 服务类
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
public interface SysEditionService extends IService<SysEdition> {

    List<ModuleVo> getEdition();
}
