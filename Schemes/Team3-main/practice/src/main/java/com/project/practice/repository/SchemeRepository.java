package com.project.practice.repository;

import com.project.practice.model.Scheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemeRepository extends JpaRepository<Scheme, Long> {
}
