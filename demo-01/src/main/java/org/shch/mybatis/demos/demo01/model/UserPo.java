package org.shch.mybatis.demos.demo01.model;

/**
 * 用户实体对象
 * @author shichao
 * @since 2022/06/05 17:11
 **/
public class UserPo {
    private Integer id;
    private String name;
    private String email;
    private Integer sex;

    public UserPo() {
    }

    public UserPo(Integer id, String name, String email, Integer sex) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
