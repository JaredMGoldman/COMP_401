import java.util.*;

public class Jedi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inventory = sc.nextInt();
        HashMap<String, Double> catalogue = new HashMap<>();
        List<String> items0 = new ArrayList<>();
        List<Integer> cust0 = new ArrayList<>();
        List<Integer> count0 = new ArrayList<>();
        for (int i = 0; i < inventory; i += 1) {
            String name = sc.next();
            double price = sc.nextDouble();
            catalogue.put(name, price);
            items0.add(name);
            cust0.add(0);
            count0.add(0);
        }
        int patrons = sc.nextInt();
        for (int i = 0; i < patrons; i += 1) {
            String first = sc.next();
            String last = sc.next();
            int itemctr = sc.nextInt();
            double cost = 0;
            for (int j = 0; j < itemctr; j += 1) {
                int qty = sc.nextInt();
                String item = sc.next();
                int index = items0.indexOf(item);
                cust0.set(index, cust0.get(index) + 1);
                count0.set(index, count0.get(index) + qty);
                cost += qty * catalogue.get(item);
            }
        }
        for (int i = 0; i < items0.size(); i++) {
            if (cust0.get(i) == 0) {
                String entry0 = "No";
                String entry1 = "";
                System.out.println(entry0 + " customers bought" + entry1 + " " + items0.get(i));
            } else {
                int entry0 = cust0.get(i);
                String entry1 = (" " + count0.get(i));
                System.out.println(entry0 + " customers bought" + entry1 + " " + items0.get(i));
            }
        }
    }
}
