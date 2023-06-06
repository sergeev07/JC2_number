import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveList = new ArrayList<>();

        for (int num : intList) {
            if (num > 0) {
                positiveList.add(num);
            }
        }

        Iterator itr = positiveList.iterator();

        while (itr.hasNext()) {
            int x = (int) itr.next();
            if (x % 2 != 0) {
                itr.remove();
            }
        }

        Collections.sort(positiveList);
        System.out.println(positiveList);
    }
}