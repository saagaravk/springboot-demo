package com.sagar.web.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagar.web.demo.entity.Category;
import com.sagar.web.demo.entity.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}