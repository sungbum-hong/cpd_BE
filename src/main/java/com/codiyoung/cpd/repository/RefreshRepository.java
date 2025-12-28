package com.codiyoung.cpd.repository;

import com.codiyoung.cpd.entity.RefreshEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RefreshRepository extends JpaRepository<RefreshEntity,Long> {



    @Transactional
    void deleteByRefresh(String refresh);

    Boolean existsByRefresh(String refresh);
}
