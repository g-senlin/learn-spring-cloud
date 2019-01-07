package com.senlin.user.dao;

import com.senlin.user.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author gsl
 * @date 2019/1/3 23:21.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
