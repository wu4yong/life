package com.qili.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <br>
 * 标题: 用户模型<br>
 * 描述: POJO类<br>
 */

@Data
@Entity
@Table(name="t_users")
public class User implements Serializable {

    private static final long serialVersionUID = -9114061474494733150L;
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    /**
     * 用户名称
     */
    @Column(name="user_name")
    private String userName;

    /**
     * 年龄
     */
    @Column(name="age")
    private Integer  age;

}
