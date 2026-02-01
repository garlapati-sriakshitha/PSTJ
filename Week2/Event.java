package solvingjava;
import java.time.LocalDate;
import java.util.*;

class Event {
    String name;
    LocalDate date;

    public Event(String name, String dateStr) {
        this.name = name;
        this.date = LocalDate.parse(dateStr);
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            events.add(new Event(input[0], input[1]));
        }

        int month = Integer.parseInt(sc.nextLine());

        events.sort(Comparator.comparing(e -> e.date));

        for (int i = 0; i < events.size(); i++) {
            System.out.print(events.get(i).name);
            if (i != events.size() - 1) System.out.print(" ");
        }
        System.out.println();

        System.out.println(events.get(0).name);

        System.out.println(events.get(events.size() - 1).name);

        boolean first = true;
        for (Event e : events) {
            if (e.date.getMonthValue() == month) {
                if (!first) System.out.print(" ");
                System.out.print(e.name);
                first = false;
            }
        }

        sc.close();
    }
}
