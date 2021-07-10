package Maventest.Maventest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Democlass {
	
	
	@Test
public void sum()
{
	System.out.println("Sum");
	int a = 10;
	int b = 20;
	Assert.assertEquals(30, a +b );
}

}
