package com.varun.algorithms.unique.elements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UniqueArrayAlgorithmTest {

	@Test
	public void numberOfUniqueSets() {
		UniqueArrayAlgorithm algorithm = new UniqueArrayAlgorithm();

		Integer[] elements = { 0, 1, 1, 4, 5, 1, 6 };

		int[] uniqueArray = algorithm.uniqueArrayWithoutUsingSets(elements);

		assertEquals(5, uniqueArray.length);
	}

}
