package com.hendisantika.springbootangular8demo.repository;

import com.hendisantika.springbootangular8demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-angular8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-01
 * Time: 05:46
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
