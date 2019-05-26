package com.grouptwo.saloon.repository;

import com.grouptwo.saloon.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
