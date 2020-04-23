package com.example.design_patterns.a_creational.factory.EXAMPLE_2;

import com.example.design_patterns.a_creational.factory.EXAMPLE_2.BLOG_RELATED.AboutPage;
import com.example.design_patterns.a_creational.factory.EXAMPLE_2.BLOG_RELATED.CommentPage;
import com.example.design_patterns.a_creational.factory.EXAMPLE_2.BLOG_RELATED.ContactPage;
import com.example.design_patterns.a_creational.factory.EXAMPLE_2.BLOG_RELATED.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
