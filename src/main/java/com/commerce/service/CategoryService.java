package com.commerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.entity.Category;
import com.commerce.repository.CategoryRepository;

@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getCategories() {
		return categoryRepository.findAll();
	}

	public Category getCategory(int id) {
		return categoryRepository.findOne(id);
	}

}
