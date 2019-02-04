package com.cg.bookmymovie.ewallet.ewallet.Ewallet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class EwalletTest {
	
	@Autowired
	private Ewallet wallet;
	
	@Test
	public void Test() {
		Ewallet wallet= new Ewallet(11, 100.00, (Set<Statement>) new Statement(1, "ab", 102.00, LocalDateTime.now(), "abc"));
		assertNotNull(wallet);
	}
	
}
