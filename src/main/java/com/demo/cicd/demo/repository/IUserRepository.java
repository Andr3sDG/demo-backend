package com.demo.cicd.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.cicd.demo.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
