package net.ket.shoppingbackend.daoimpl;
//ctrl+shift+O for automatic import
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.ket.shoppingbackend.dao.CategoryDAO;
import net.ket.shoppingbackend.dto.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>(); //ArrayList<>() constructor for empty array list

	static { //Using static to initialise as soon as categories intialised no object cration needed
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description for television");
		category.setImageURL("cat_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description for Mobile");
		category.setImageURL("cat_2.png");
		
		categories.add(category);
		
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description for Laptop");
		category.setImageURL("cat_3.png");
		
		categories.add(category);
		
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for (Category category : categories)
		{
			if(category.getId() == id)
			{ return category;}
		}
		return null;
	}

}
