package C1;

public class SelectionSort {
	/**
	 * i�� j�� ��ġ�� �ִ� ���� �ٲߴϴ�.
	 */
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	/**
	 * start�κ��� �����ϴ� �ּڰ��� ��ġ�� ã��(start ����)
	 * �迭�� ������ ��ġ�� ���ϴ�.
	 */
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for(int i = start; i < array.length; i++) {
			if (array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		
		return lowIndex;
	}
	
	/**
	 * ���� ������ ����Ͽ� ��Ҹ� �����մϴ�.
	 */
	public static void selectionSort(int [] array) {
		for(int i = 0; i < array.length; i++) {
			int j = indexLowest(array, i);
			swapElements(array, i, j);
		}
	}
	
}
