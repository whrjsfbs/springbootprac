package com.ckr.prac.entity;

import javax.persistence.*;

@Entity(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;
    private String email;

    public UserEntity() {
    }

    public UserEntity(Long idx, String email, String name)
    {
        this.idx=idx;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }
}
