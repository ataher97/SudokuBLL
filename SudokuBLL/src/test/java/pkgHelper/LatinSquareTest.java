package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test2() {

		int[] arr = { 1, 1, 3, 4, 5 };
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test3() {

		int[] arr = { 1, 2, 3, 4, 1 };
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicates_test4() {

		int[] arr = null;
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasDuplicates(arr));
	}

	@Test
	public void doesElementExist_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 3;
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.doesElementExist(arr, iValue));
	}

	@Test
	public void doesElementExist_test2() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 99;
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.doesElementExist(arr, iValue));
	}

	@Test
	public void doesElementExist_test3() {

		int[] arr = null;
		int iValue = 1;
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.doesElementExist(arr, iValue));
	}

	@Test
	public void hasAllValues_test1() {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3 };
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.hasAllValues(arr1, arr2));
	}

	@Test
	public void hasAllValues_test2() {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3, 4 };
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasAllValues(arr1, arr2));
	}

	@Test
	public void hasAllValues_test3() {

		int[] arr1 = null;
		int[] arr2 = { 1, 2, 3, 4 };
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasAllValues(arr1, arr2));
	}

	@Test
	public void hasAllValues_test4() {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = null;
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasAllValues(arr1, arr2));
	}

	@Test
	public void getColumn_test1() {

		int iCol = 0;
		int[] arr1 = { 0, 1, 3, 4 };
		LatinSquare lq = new LatinSquare();
		int[] arr2 = lq.getColumn(iCol);

		assertTrue(Arrays.equals(arr1, arr2));
	}

	@Test
	public void getColumn_test2() {

		int iCol = 3;
		int[] arr1 = { 3, 4, 2, 2 };
		LatinSquare lq = new LatinSquare();
		int[] arr2 = lq.getColumn(iCol);

		assertTrue(Arrays.equals(arr1, arr2));

	}

	@Test
	public void getColumn_tes3() {

		int iCol = 0;
		int[] arr1 = { 1, 1, 1, 1 };
		LatinSquare lq = new LatinSquare();
		int[] arr2 = lq.getColumn(iCol);

		assertFalse(Arrays.equals(arr1, arr2));

	}
	
	@Test
	public void getRow_tes1() {

		int iRow = 0;
		int[] arr1 = {0, 1, 2, 3 };
		LatinSquare lq = new LatinSquare();
		int[] arr2 = lq.getRow(iRow);

		assertTrue(Arrays.equals(arr1, arr2));

	}
	
	@Test
	public void getRow_tes2() {

		int iRow = 3;
		int[] arr1 = { 4, 1, 3, 2 };
		LatinSquare lq = new LatinSquare();
		int[] arr2 = lq.getRow(iRow);

		assertTrue(Arrays.equals(arr1, arr2));

	}
	
	@Test
	public void getRow_tes3() {

		int iRow = 0;
		int[] arr1 = { 1, 1, 1, 1 };
		LatinSquare lq = new LatinSquare();
		int[] arr2 = lq.getRow(iRow);
		
		//System.out.println(Arrays.toString(arr1));
		//System.out.println(Arrays.toString(arr2));

		assertFalse(Arrays.equals(arr1, arr2));

	}

/*	@Test
	public void random() {

		LatinSquare lq = new LatinSquare();
		
		System.out.println(Arrays.toString());
		System.out.println(Arrays.toString());
		
		int[] arr2 = lq.getColumn(icol);

		assertTrue(Arrays.equals(arr1, arr2));

	}
*/

}