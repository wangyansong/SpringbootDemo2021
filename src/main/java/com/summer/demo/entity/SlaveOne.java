package com.summer.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("salve_1")
public class SlaveOne {

    @TableId
    private Long id;

    private String name;

}
