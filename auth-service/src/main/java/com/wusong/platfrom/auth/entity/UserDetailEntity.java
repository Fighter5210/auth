package com.wusong.platfrom.auth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@Data
@TableName(value = "t_user_detail")
public class UserDetailEntity implements Serializable {
    private static final long serialVersionUID = 687731149217356207L;
    @TableId(type = IdType.AUTO)
    private Long id;
    
    private Integer userId;

    private String userWork;
}
