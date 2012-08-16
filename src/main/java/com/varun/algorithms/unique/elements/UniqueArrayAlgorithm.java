package com.varun.algorithms.unique.elements;

import java.util.ArrayList;
import java.util.List;

public class UniqueArrayAlgorithm {

	public int[] uniqueArrayWithoutUsingSets(Integer[] arrayElements) {
		List<Integer> uniqueArray = new ArrayList<Integer>();

		for (int i = 0; i < arrayElements.length; i++) {
			int currentValue = arrayElements[i];
			if (contains(uniqueArray, currentValue) == false) {
				uniqueArray.add(currentValue);
			}
		}

		return convertListToArray(uniqueArray);
	}

	private int[] convertListToArray(List<Integer> list) {
		int[] uniqueArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			uniqueArray[i] = list.get(i);
		}
		return uniqueArray;
	}

	private boolean contains(List<Integer> uniqueArray, int currentValue) {
		for (int i = 0; i < uniqueArray.size(); i++) {
			if (uniqueArray.get(i) == currentValue) {
				return true;
			}
		}
		return false;
	}
}
