package com.qili.repository;

import com.qili.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository  extends JpaRepository<User, Integer> {

}
