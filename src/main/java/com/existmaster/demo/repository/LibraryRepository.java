package com.existmaster.demo.repository;

import com.existmaster.demo.domain.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LibraryRepository extends JpaRepository<Library,Long> {
}
