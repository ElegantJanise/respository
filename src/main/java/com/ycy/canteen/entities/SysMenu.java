package com.ycy.canteen.entities;

import lombok.Data;

import java.util.Date;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Data
public class SysMenu implements PostEntity {

    /**
     * 主键id
     */
    private String id;

    /**
     * 菜单编码
     */
    private String code;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单路径
     */
    private String url;

    /**
     * 备用字段
     */
    private String modular;

    /**
     * 操作权限
     */
    private String operationPower;

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
