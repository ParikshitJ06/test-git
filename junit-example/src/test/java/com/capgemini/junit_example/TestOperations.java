package com.capgemini.junit_example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Basic Arithmetic Operations")
public class TestOperations {
	
MathUtils mathUtils = new MathUtils();
	
	@Nested
	@DisplayName("Basic Arithmetic Operations")
	class MathUtilsTestOperations {
		
		@Test
		@DisplayName("Should return addtion value ")
		void testAddition() {
			assertEquals(5, mathUtils.add(2, 3));
		}
		
		@Test
		@DisplayName("Should return mutiplied value ")
		void testMutiply() {
			assertEquals(10, mathUtils.multipy(5,2));
		}
		
		
		@ParameterizedTest
		@ValueSource(ints = {0}) 
		@DisplayName("Should return divided value ")
		void testDivide(int num) {
//			assertEquals(2.0, mathUtils.divide(2, num));
			
			assertThrows(ArithmeticException.class, ()->{
				 mathUtils.divide(2, num);
			});
			
		}
		
		
	}

}
