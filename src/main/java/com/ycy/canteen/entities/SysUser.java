package com.ycy.canteen.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Data
public class SysUser implements PostEntity {

    /**
     * 主键id
     */
    private String id;


    /**
     * 角色id（版本）
     */
    private String sysRoleId;

    /**
     * 用户名（和手机号相同）
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 公司id
     */
    private String sysOutsourceCompanyId;

    /**
     * 绑定状态 0：预绑定 1：绑定 
     */
    private Integer status;

    /**
     * 状态 1：负责人 2：厨师长 0：食堂员工 
     */
    private Integer position;

    /**
     * 性别 1：男 2：女 
     */
    private Integer sex;

    /**
     * 出生日期  格式yyyy-MM-dd
     */
    private String birthday;

    /**
     * 功能模块
     */
    private String modular;

    /**
     * 绑定时间，格式yyyy-MM-dd
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createDate;

    /**
     * 状态 0：正常 1：删除 
     */
    private Integer isDelete;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;

}
