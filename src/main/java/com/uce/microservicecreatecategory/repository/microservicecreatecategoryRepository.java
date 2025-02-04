package com.uce.microservicecreatecategory.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uce.microservicecreatecategory.model.Category;

public interface microservicecreatecategoryRepository extends JpaRepository<Category, UUID> {
}

