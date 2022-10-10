package com.ycy.canteen.controller.system;


import com.ycy.canteen.constant.Result;
import com.ycy.canteen.entities.SysEdition;
import com.ycy.canteen.entities.SysMenu;
import com.ycy.canteen.service.SysEditionService;
import com.ycy.canteen.utils.CommonUtil;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 版本表 前端控制器
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Slf4j
@RestController
@Api(value = "SysEditionController", tags = {"版本信息接口"})
@AllArgsConstructor
@RequestMapping("/sysEdition")
public class SysEditionController {

    private final SysEditionService service;

    @PostMapping("/addEdition")
    public Result addEdition (@RequestBody SysEdition sysEdition) {
        sysEdition.setId(CommonUtil.getUUID());
        service.save(sysEdition);
        return Result.success(sysEdition.getId());
    }

    /**
     * 获取版本
     * @return
     */
    @GetMapping("/getEdition")
    public Result getEdition() {
        return Result.success(service.getEdition());
    }

}

