package com.varun.algorithms.union.find.quickfind;

public class QuickFindAlgorithm {

	private int[] elements;

	public QuickFindAlgorithm(int numberOfElements) {
		elements = new int[numberOfElements];
		initArrayElementsToItsIndex();
	}

	private void initArrayElementsToItsIndex() {
		for (int i = 0; i < elements.length; i++) {
			elements[i] = i;
		}
	}

	public void union(int firstNodeIndex, int secondNodeIndex) {
		int firstNodeValue = elements[firstNodeIndex];
		int secondNodeValue = elements[secondNodeIndex];

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == firstNodeValue) {
				elements[i] = secondNodeValue;
			}
		}
	}

	public boolean connected(int firstNodeIndex, int secondNodeIndex) {
		return elements[firstNodeIndex] == elements[secondNodeIndex];
	}

	public int numberOfConnectedComponents() {
		for (int i = 0; i < elements.length; i++) {

		}
		return 0;
	}

}
