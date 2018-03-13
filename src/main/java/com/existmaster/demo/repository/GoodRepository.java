package com.existmaster.demo.repository;

import com.existmaster.demo.domain.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GoodRepository extends JpaRepository<Good,Long> {
}
