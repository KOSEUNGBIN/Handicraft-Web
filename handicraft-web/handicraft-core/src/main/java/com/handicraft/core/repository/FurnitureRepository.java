package com.handicraft.core.repository;

import com.handicraft.core.dto.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 고승빈 on 2017-07-06.
 */
@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, Long> {

    Furniture findTopByOrderByFidDesc();



}