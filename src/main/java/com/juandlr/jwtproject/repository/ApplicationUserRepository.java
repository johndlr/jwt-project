package com.juandlr.jwtproject.repository;


import com.juandlr.jwtproject.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Long> {

    Optional<ApplicationUser> findByUserName(String userName);

    Boolean existsByEmail(String email);

    Boolean existsByUserName(String userName);

}
