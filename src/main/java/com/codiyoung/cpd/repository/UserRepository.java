package com.codiyoung.cpd.repository;

import com.codiyoung.cpd.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    @Query("""
            SELECT u
            FROM UserEntity u
            WHERE u.username = :username
            """)
    Optional<UserEntity> findByUsername(@Param("username") String username);
}
