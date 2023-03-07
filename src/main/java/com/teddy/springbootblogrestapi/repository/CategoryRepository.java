package com.teddy.springbootblogrestapi.repository;

import com.teddy.springbootblogrestapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
