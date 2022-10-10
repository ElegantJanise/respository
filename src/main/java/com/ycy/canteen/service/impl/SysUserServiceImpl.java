package com.ycy.canteen.service.impl;

import com.ycy.canteen.entities.SysUser;
import com.ycy.canteen.mapper.SysUserMapper;
import com.ycy.canteen.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    private final SysUserMapper mapper;

}
