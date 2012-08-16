package com.varun.algorithms.union.find.quickfind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuickFindAlgorithmTest {

	@Test
	public void unionTwoNodes() {
		QuickFindAlgorithm algorithm = new QuickFindAlgorithm(10);

		algorithm.union(1, 4);

		assertTrue(algorithm.connected(1, 4));
	}

	@Test
	public void unionTransitiveRelation() {
		QuickFindAlgorithm algorithm = new QuickFindAlgorithm(10);

		algorithm.union(1, 2);
		algorithm.union(2, 3);

		assertTrue(algorithm.connected(1, 3));
	}

	@Test
	public void unionReflexiveRelation() {
		QuickFindAlgorithm algorithm = new QuickFindAlgorithm(10);

		algorithm.union(1, 2);

		assertTrue(algorithm.connected(2, 1));
	}

	@Test
	public void numberOfConnectedComponents() {
		QuickFindAlgorithm algorithm = new QuickFindAlgorithm(10);

		algorithm.union(1, 2);
		algorithm.union(3, 4);
		algorithm.union(5, 6);
		algorithm.union(7, 8);

		assertEquals(6, algorithm.numberOfConnectedComponents());
	}

}
