package com.ycy.canteen.service.impl;

import com.ycy.canteen.entities.SysOutsourceCompany;
import com.ycy.canteen.mapper.SysOutsourceCompanyMapper;
import com.ycy.canteen.service.SysOutsourceCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 外包公司表 服务实现类
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Service
@AllArgsConstructor
public class SysOutsourceCompanyServiceImpl extends ServiceImpl<SysOutsourceCompanyMapper, SysOutsourceCompany> implements SysOutsourceCompanyService {

    private final SysOutsourceCompanyMapper mapper;

}
