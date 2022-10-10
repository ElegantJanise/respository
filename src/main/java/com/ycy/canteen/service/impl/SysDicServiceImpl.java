package com.ycy.canteen.service.impl;

import com.ycy.canteen.entities.SysDic;
import com.ycy.canteen.mapper.SysDicMapper;
import com.ycy.canteen.service.SysDicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Service
@AllArgsConstructor
public class SysDicServiceImpl extends ServiceImpl<SysDicMapper, SysDic> implements SysDicService {

    public final SysDicMapper mapper;

}
