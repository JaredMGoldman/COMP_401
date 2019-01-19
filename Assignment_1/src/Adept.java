import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;


public class Adept {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int inventory = sc.nextInt();
        HashMap<String,Double> catalogue = new HashMap<>();
        for(int i = 0; i < inventory; i += 1){
            String name = sc.next();
            double price = sc.nextDouble();
            catalogue.put(name, price);
        }
        int patrons =  sc.nextInt();
        List<Double> costs = new ArrayList<>();
        List<String> names = new ArrayList<>();
        for(int i = 0; i < patrons; i += 1){
            String first = sc.next();
            String last = sc.next();
            int itemctr = sc.nextInt();
            double cost = 0;
            for(int j = 0; j < itemctr; j += 1){
                int qty = sc.nextInt();
                String item = sc.next();
                cost += qty*catalogue.get(item);
            }
            costs.add(cost);
            names.add(first + " " + last);
        }
        double largest = Collections.max(costs);
        String biggest = names.get(costs.lastIndexOf(largest));
        double smallest = Collections.min(costs);
        String littlest = names.get(costs.lastIndexOf(smallest));
        double sum = 0;
        for(int i = 0; i < patrons; i += 1) {
            sum += costs.get(i);
        }
        double average = sum/costs.size();
        System.out.println("Biggest: " + biggest + " (" + String.format("%.2f", largest) + ")");
        System.out.println("Smallest: " + littlest + " (" + String.format("%.2f", smallest) + ")");
        System.out.println("Average: " + String.format("%.2f", average));
    }
}