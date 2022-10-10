package com.ycy.canteen.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 版本表
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Data
public class SysEdition implements PostEntity {

    /**
     * 主键id
     */
    private String id;

    /**
     * 版本编码
     */
    private String code;

    /**
     * 版本名称
     */
    private String name;

    /**
     * 所属模块
     */
    private String module;

    /**
     * 排序 （根据模块排序）
     */
    private Integer sort;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

}
