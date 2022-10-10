package com.ycy.canteen.entities;

import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 字典类型表
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Data
public class SysDicType implements PostEntity {

    /**
     * 主键id
     */
    private String id;

    /**
     * 父id
     */
    private String parentId;

    /**
     * 类别编码
     */
    private String code;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 层级 
     */
    private Integer level;

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
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime updateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysDicType{" +
        "id=" + id +
        ", parentId=" + parentId +
        ", code=" + code +
        ", name=" + name +
        ", level=" + level +
        ", isDelete=" + isDelete +
        ", remarks=" + remarks +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
