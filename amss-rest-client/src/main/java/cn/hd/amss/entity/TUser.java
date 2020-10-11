package cn.hd.amss.entity;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2020-10-09 23:02:46
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = -66682038238439375L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 年龄
     */
    private Integer age;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}