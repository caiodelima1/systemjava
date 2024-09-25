package com.limacaio.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limacaio.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
