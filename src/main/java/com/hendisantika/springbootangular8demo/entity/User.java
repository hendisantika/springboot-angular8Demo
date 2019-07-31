package com.hendisantika.springbootangular8demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-angular8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-01
 * Time: 05:45
 */
@Entity
@Data
public class User {
    private final String name;
    private final String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}