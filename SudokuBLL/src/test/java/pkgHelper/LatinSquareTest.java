package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };

		assertFalse(LatinSquare.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test2() {

		int[] arr = { 1, 1, 3, 4, 5 };

		assertTrue(LatinSquare.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test3() {

		int[] arr = { 1, 2, 3, 4, 1 };

		assertTrue(LatinSquare.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test4() {

		int[] arr = null;

		assertFalse(LatinSquare.hasDuplicates(arr));
	}

	@Test
	public void doesElementExist_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 3;

		assertTrue(LatinSquare.doesElementExist(arr, iValue));
	}

	@Test
	public void doesElementExist_test2() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 99;

		assertFalse(LatinSquare.doesElementExist(arr, iValue));
	}

	@Test
	public void doesElementExist_test3() {

		int[] arr = null;
		int iValue = 1;

		assertFalse(LatinSquare.doesElementExist(arr, iValue));
	}

	@Test
	public void hasAllValues_test1() {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3 };

		assertTrue(LatinSquare.hasAllValues(arr1, arr2));
	}

	@Test
	public void hasAllValues_test2() {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3, 4 };

		assertFalse(LatinSquare.hasAllValues(arr1, arr2));
	}

	@Test
	public void hasAllValues_test3() {

		int[] arr1 = null;
		int[] arr2 = { 1, 2, 3, 4 };

		assertFalse(LatinSquare.hasAllValues(arr1, arr2));
	}

	@Test
	public void hasAllValues_test4() {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = null;

		assertFalse(LatinSquare.hasAllValues(arr1, arr2));
	}

	@Test
	public void getColumn_test1() {

		int iCol = 0;
		int[][] LatinSquare = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = ls.getColumn(iCol);

		assertTrue(Arrays.equals(arr1, arr2));
	}

	@Test
	public void getColumn_test2() {

		int iCol = 2;
		int[][] LatinSquare = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);
		int[] arr1 = { 3, 1, 2 };
		int[] arr2 = ls.getColumn(iCol);

		assertTrue(Arrays.equals(arr1, arr2));

	}

	@Test
	public void getColumn_test3() {

		int iCol = 0;
		int[][] LatinSquare = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);
		int[] arr1 = { 3, 1, 2 };
		int[] arr2 = ls.getColumn(iCol);

		assertFalse(Arrays.equals(arr1, arr2));

	}

	@Test
	public void getRow_test1() {

		int iRow = 0;
		int[][] LatinSquare = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = ls.getRow(iRow);

		assertTrue(Arrays.equals(arr1, arr2));

	}

	@Test
	public void getRow_test2() {

		int iRow = 2;
		int[][] LatinSquare = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);
		int[] arr1 = { 3, 1, 2 };
		int[] arr2 = ls.getRow(iRow);

		assertTrue(Arrays.equals(arr1, arr2));

	}

	@Test
	public void getRow_test3() {

		int iRow = 0;
		int[][] LatinSquare = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);
		int[] arr1 = { 3, 1, 2 };
		int[] arr2 = ls.getRow(iRow);

		assertFalse(Arrays.equals(arr1, arr2));

	}

	@Test
	public void isLatinSquare_test1() {

		int[][] LatinSquare = { { 2, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);

		assertFalse(ls.isLatinSquare());

	}

	@Test
	public void isLatinSquare_test2() {

		int[][] LatinSquare = { { 1, 2, 4 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);

		assertFalse(ls.isLatinSquare());

	}

	@Test
	public void isLatinSquare_test3() {

		int[][] LatinSquare = { { 1, 2, 3 }, { 1, 3, 2 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);

		assertFalse(ls.isLatinSquare());

	}
	
	@Test
	public void isLatinSquare_test4() {

		int[][] LatinSquare = { { 1, 2, 3, 4 }, { 2, 1, 4, 3 }, { 3, 4, 1, 2 }, {4, 3, 2, 1} };
		LatinSquare ls = new LatinSquare(LatinSquare);

		assertTrue(ls.isLatinSquare());

	}

	@Test
	public void ContainsZero_test1() {

		int[][] LatinSquare = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);

		assertFalse(ls.ContainsZero());

	}

	@Test
	public void ContainsZero_test2() {

		int[][] LatinSquare = { { 0, 2, 3 }, { 2, 3, 0 }, { 3, 0, 2 } };
		LatinSquare ls = new LatinSquare(LatinSquare);

		assertTrue(ls.ContainsZero());

	}

	@Test
	public void code_test() {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rowLength = arr.length;

		int[] column = new int[rowLength];

		for (int i = 0; i < rowLength; i++) {
			int num = arr[i][2];
			column[i] = num;
		}
	}
}
