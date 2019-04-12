package com.hsl.cn.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class UserDetailCase {
    @Id
    @GeneratedValue
    private Integer id;
    private String userId;
    private String except;
}
