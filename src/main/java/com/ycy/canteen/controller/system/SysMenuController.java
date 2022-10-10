package com.ycy.canteen.controller.system;


import com.ycy.canteen.constant.Result;
import com.ycy.canteen.entities.SysMenu;
import com.ycy.canteen.service.SysMenuService;
import com.ycy.canteen.utils.CommonUtil;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Slf4j
@RestController
@Api(value = "SysMenuController", tags = {"菜单信息接口"})
@AllArgsConstructor
@RequestMapping("/sysMenu")
public class SysMenuController {

    public final SysMenuService service;

    @PostMapping("/addMenu")
    public Result addMenu (@RequestBody SysMenu sysMenu) {
        sysMenu.setId(CommonUtil.getUUID());
        service.save(sysMenu);
        return Result.success(sysMenu.getId());
    }

}

