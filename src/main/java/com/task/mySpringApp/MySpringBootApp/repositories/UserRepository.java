package com.task.mySpringApp.MySpringBootApp.repositories;

import com.task.mySpringApp.MySpringBootApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
