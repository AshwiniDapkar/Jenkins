package com.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
@Test
public void testLogin1()
{
	App	myapp=new App();
Assert.assertEquals(0,myapp.userLogin("abc","abc123")); //invalid TC therefore 0 is there
}
public void testLogin2()
{
	App	myapp=new App();
	
Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));
}
}
