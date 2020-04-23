package com.example.design_patterns.a_creational.factory.EXAMPLE_2;

import com.example.design_patterns.a_creational.factory.EXAMPLE_2.SHOP_RELATED.CartPage;
import com.example.design_patterns.a_creational.factory.EXAMPLE_2.SHOP_RELATED.ItemPage;
import com.example.design_patterns.a_creational.factory.EXAMPLE_2.SHOP_RELATED.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
