package com.itmayiedu.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author evanYang
 * @version 1.0
 * @date 08/20/2019 16:48
 */
@Table(name = "user")
public class User {

    @Id
    private Integer id;

    //@Column(name = "user_name")
    private String userName;

    //@Column(name = "user_phone")
    private String userPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
