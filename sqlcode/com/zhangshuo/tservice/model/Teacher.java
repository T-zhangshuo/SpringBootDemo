package com.zhangshuo.tservice.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangshuo
 * @since 2018-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Teacher")
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Integer age;

    private String subject;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
