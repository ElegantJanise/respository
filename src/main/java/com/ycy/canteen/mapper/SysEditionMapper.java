package com.ycy.canteen.mapper;

import com.ycy.canteen.entities.SysEdition;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 版本表 Mapper 接口
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Mapper
public interface SysEditionMapper extends BaseMapper<SysEdition> {

    List<SysEdition> getEdition();

}
