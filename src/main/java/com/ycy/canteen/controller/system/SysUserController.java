package com.ycy.canteen.controller.system;


import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Slf4j
@RestController
@Api(value = "SysUserController", tags = {"用户信息接口"})

@RequestMapping("/sysUser")
public class SysUserController {

}

