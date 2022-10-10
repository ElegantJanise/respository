package com.ycy.canteen.service.impl;

import com.ycy.canteen.entities.SysCompany;
import com.ycy.canteen.mapper.SysCompanyMapper;
import com.ycy.canteen.service.SysCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Service
@AllArgsConstructor
public class SysCompanyServiceImpl extends ServiceImpl<SysCompanyMapper, SysCompany> implements SysCompanyService {

    private final SysCompanyMapper mapper;

}
