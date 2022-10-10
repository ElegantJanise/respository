package com.ycy.canteen.service.impl;

import com.ycy.canteen.entities.SysDicType;
import com.ycy.canteen.mapper.SysDicTypeMapper;
import com.ycy.canteen.service.SysDicTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典类型表 服务实现类
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Service
@AllArgsConstructor
public class SysDicTypeServiceImpl extends ServiceImpl<SysDicTypeMapper, SysDicType> implements SysDicTypeService {

    private final SysDicTypeMapper mapper;

}
