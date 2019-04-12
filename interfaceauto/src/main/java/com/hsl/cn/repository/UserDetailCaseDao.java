package com.hsl.cn.repository;

import com.hsl.cn.model.UserDetailCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailCaseDao extends JpaRepository<UserDetailCase,Integer> {

    UserDetailCase findByUserId(Integer integer);

}
