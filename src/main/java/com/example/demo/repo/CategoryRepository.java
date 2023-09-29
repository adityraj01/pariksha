package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.exam.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
