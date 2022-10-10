package com.ycy.canteen.service.impl;

import com.ycy.canteen.entities.SysEdition;
import com.ycy.canteen.mapper.SysEditionMapper;
import com.ycy.canteen.service.SysEditionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ycy.canteen.vo.ModuleVo;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * <p>
 * 版本表 服务实现类
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Service
@AllArgsConstructor
public class SysEditionServiceImpl extends ServiceImpl<SysEditionMapper, SysEdition> implements SysEditionService {

    private final SysEditionMapper mapper;

    @Override
    public List<ModuleVo> getEdition() {
        List<SysEdition> list = mapper.getEdition();
        List<ModuleVo> result = new ArrayList<>();
        if (list.size() > 0) {
            List<SysEdition> collect = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(SysEdition::getModule))), ArrayList::new));
            for (SysEdition edition : collect) {
                ModuleVo module = new ModuleVo();
                BeanUtils.copyProperties(edition, module);
                list.stream().forEach(item -> {
                    if (StringUtils.equals(item.getModule(), edition.getModule())) {
                        module.getList().add(item);
                    }
                });
                result.add(module);
            }
        }
        return result.stream().sorted(Comparator.comparing(ModuleVo::getSort) ).collect(Collectors.toList());
    }
}
