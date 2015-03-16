package com.testing.DAO.category;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({Slow.class})
@SuiteClasses({A.class, B.class})
public class C {

	@Test
	public void test() {		
	}
}
