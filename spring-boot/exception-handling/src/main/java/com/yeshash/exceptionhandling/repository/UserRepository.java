package com.yeshash.exceptionhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yeshash.exceptionhandling.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
