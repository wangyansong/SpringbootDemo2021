package com.summer.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("salve_2")
public class SlaveTwo {

    @TableId
    private Long id;

    private String name;

}
