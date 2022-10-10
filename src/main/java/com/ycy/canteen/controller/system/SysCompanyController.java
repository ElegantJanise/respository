package com.ycy.canteen.controller.system;


import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 公司表 前端控制器
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Slf4j
@RestController
@Api(value = "SysCompanyController", tags = {"公司信息接口"})
@RequestMapping("/sysCompany")
public class SysCompanyController {

}

