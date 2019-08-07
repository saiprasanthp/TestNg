package com.retryAnalizer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnalyzer {
	
	@Test
	public void m1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void m2() {
		Assert.assertEquals(true, false);
	}

}
