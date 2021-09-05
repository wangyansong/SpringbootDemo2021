package com.summer.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class User {

    @TableId
    private Long id;

    private String name;

    private String email;

    @TableField(value = "create_time", fill = FieldFill.INSERT )
    private Date createTime;

    @TableField(value = "modify_time", fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;

    private Integer sequence;

}
