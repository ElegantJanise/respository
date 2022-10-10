package com.ycy.canteen.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 * 外包公司表
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Data
public class SysOutsourceCompany implements PostEntity {

    /**
     * 主键
     */
    private String id;

    /**
     * 绑定公司id
     */
    private String companyId;

    /**
     * 外包公司名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

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
