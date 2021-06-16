import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Random random = new Random();

		list.addAll(random.ints(6, 0, 51).boxed().toList());

		List<Integer> lowestElementsList = findTop3Lowest(list);
		List<Integer> highestElementsList = findTop3Highest(list);
		List<Integer> sortedList = sortedAsc(list);

		System.out.println("SORTED LIST");
		sortedList.stream().forEach(System.out::println);
		System.out.println("TOP 3 LOWEST");
		lowestElementsList.stream().forEach(System.out::println);
		System.out.println("TOP 3 HIGHEST");
		highestElementsList.stream().forEach(System.out::println);
	}

	private static List<Integer> findTop3Lowest(List<Integer> arrayList) {
		return arrayList.stream().distinct().limit(3).toList();
	}

	private static List<Integer> findTop3Highest(List<Integer> arrayList) {
		List<Integer> reverseList = arrayList;
		Collections.reverse(reverseList);
		return reverseList.stream().distinct().limit(3).toList();
	}

	private static List<Integer> sortedAsc(List<Integer> arrayList) {
		return arrayList.stream().sorted().toList();
	}
}
