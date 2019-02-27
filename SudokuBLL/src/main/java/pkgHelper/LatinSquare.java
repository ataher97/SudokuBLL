package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] puzzle) {
		super();
		this.LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public static boolean hasDuplicates(int[] arr) {
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

	public static boolean doesElementExist(int[] arr, int iValue) {
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

	public static boolean hasAllValues(int[] arr1, int[] arr2) {
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

		int rowLength = this.LatinSquare.length;

		int[] column = new int[rowLength];

		for (int i = 0; i < rowLength; i++) {
			int num = this.LatinSquare[i][iCol];
			column[i] = num;
		}
		return column;
	}

	public int[] getRow(int iRow) {

		int[] row = this.LatinSquare[iRow];
		return row;
	}
	
	public boolean isLatinSquare() {
		boolean isLatinSquare = true;

		int rowLength = this.LatinSquare.length;

		for (int i = 0; i < rowLength; i++) {
			//System.out.println(i);
			//System.out.println(Arrays.toString(getColumn(i)));
			//System.out.println(Arrays.toString(getRow(i)));
			if (hasDuplicates(getColumn(i)) == true) {

				return false;
			}
			if (hasDuplicates(getRow(i)) == true) {
				return false;
			}
		}

		for (int j = 0; j < rowLength - 1; j++) {
			if (hasAllValues(getColumn(j), getColumn(j + 1)) == false) {
				return false;
			}
			if (hasAllValues(getRow(j), getRow(j + 1)) == false) {
				return false;
			}
		}
		return isLatinSquare;

	}

	public boolean ContainsZero() {
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++) {
			for (int iCol = 0; iCol < this.LatinSquare.length; iCol++) {
				if (this.LatinSquare[iRow][iCol] == 0) {
					return true;
				}
			}
		}
		return false;
	}
}