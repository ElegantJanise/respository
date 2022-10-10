package com.ycy.canteen.entities;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author yangfan
 * @since 2022-10-09
 */
@Data
public class SysDic implements PostEntity {

    /**
     * 主键id
     */
    private String id;

    /**
     * 字典类型id
     */
    private String sysDicTypeId;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 层级 
     */
    private Integer level;

    /**
     * 状态 0：启用 1：停用 
     */
    private Integer status;

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

    public String getSysDicTypeId() {
        return sysDicTypeId;
    }

    public void setSysDicTypeId(String sysDicTypeId) {
        this.sysDicTypeId = sysDicTypeId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "SysDic{" +
        "id=" + id +
        ", sysDicTypeId=" + sysDicTypeId +
        ", code=" + code +
        ", name=" + name +
        ", level=" + level +
        ", status=" + status +
        ", isDelete=" + isDelete +
        ", remarks=" + remarks +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
