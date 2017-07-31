package net.ket.shoppingbackend.dao;

import java.util.List;

import net.ket.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list(); //List method returning list of category

	Category get(int id);
	
	
	
	
}
