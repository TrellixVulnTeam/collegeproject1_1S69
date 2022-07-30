package com.custotomer.customer.reposit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.custotomer.customer.model.Category;
import com.custotomer.customer.model.Users;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	}

