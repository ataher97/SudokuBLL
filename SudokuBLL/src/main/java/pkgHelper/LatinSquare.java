package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {

	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;

		if (arr == null) {
			return false;
		}

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				hasDuplicates = true;
				break;
			}
		}

		return hasDuplicates;
	}

	public boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;

		if (arr == null) {
			return false;
		}

		for (int i : arr) {
			if (i == iValue) {
				doesElementExist = true;
				break;
			}
		}

		return doesElementExist;
	}

	public boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean hasAllValues = true;

		if (arr1 == null) {
			return false;
		} else if (arr2 == null) {
			return false;
		}

		for (int i : arr2) {
			int counter = 0;
			for (int j : arr1) {
				if (i == j) {
					break;
				} else {
					counter++;
				}
				if (counter == arr1.length) {
					hasAllValues = false;
					return hasAllValues;
				}
			}
		}
		return hasAllValues;
	}

	public int[] getColumn(int iCol) {
		int[][] LatinSquare = { { 0, 1, 2, 3 }, { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 4, 1, 3, 2 } };

		int[] column = { 0, 0, 0, 0 };

		for (int i = 0; i < 4; i++) {
			int num = LatinSquare[i][iCol];
			column[i] = num;
		}

		return column;
	}

	public int[] getRow(int iRow) {
		int[][] LatinSquare = { { 0, 1, 2, 3 }, { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 4, 1, 3, 2 } };

		int[] row = LatinSquare[iRow];
		return row;
	}

	public boolean isLatinSquare() {
		boolean isLatinSquare = true;

		for (int i = 0; i < 4; i++) {
			if (hasDuplicates(getColumn(i)) == true) {
				return false;
			}
			if (hasDuplicates(getRow(i)) == true) {
				return false;
			}

		}

		return isLatinSquare;
	}

	public boolean ContainsZero() {
		boolean ContainsZero = false;
		
		

		return ContainsZero;
	}
	
	
	
	
}