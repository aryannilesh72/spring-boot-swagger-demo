package com.assessment.demo.service;

import com.assessment.demo.model.NomenClature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NomenClatureRepository extends JpaRepository<NomenClature, Long> {

}