package com.example.annotationprocessing.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface SponsorRepository extends JpaRepository<Sponsor, Long>, QuerydslPredicateExecutor<Sponsor> {
}
