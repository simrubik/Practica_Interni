package com.ana.test;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ana.MyClass;

public class MyClassTest{

	@Test
	public void sumTest(){
		MyClass c = new MyClass();
		
		assertEquals(6, c.sum(2, 4));
	}
}
