import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		Random random = new Random();

		int[] array = random.ints(50, 0, 51).toArray();

		int[] sortedList = sortedAsc(array);
		int[] lowestElementsArray = lowestElementsArray(array);
		int[] highestElementsArray = highestElementsArray(array);
	}

	private static int[] sortedAsc(int[] array) {
		int aux;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[i]) {
					aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
		}

		return array;
	}

	private static int[] lowestElementsArray(int[] array) {
		int[] lowestElementsArray = new int[3];

		int lastIndexElement = -1;

		for (int i = 0; i < array.length && lastIndexElement < 2; i++) {
			if (lastIndexElement == -1) {
				lowestElementsArray[++lastIndexElement] = array[i];
			} else if (lowestElementsArray[lastIndexElement] != array[i]) {
				lowestElementsArray[++lastIndexElement] = array[i];
			}
		}

		return lowestElementsArray;
	}

	private static int[] highestElementsArray(int[] array) {
		int[] highestElementsArray = new int[3];

		int lastIndexElement = -1;

		for (int i = array.length - 1; i >= 0 && lastIndexElement < 2; i--) {
			if (lastIndexElement == -1) {
				highestElementsArray[++lastIndexElement] = array[i];
			} else if (highestElementsArray[lastIndexElement] != array[i]) {
				highestElementsArray[++lastIndexElement] = array[i];
			}
		}

		return highestElementsArray;
	}

}
