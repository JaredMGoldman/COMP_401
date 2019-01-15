import java.util.*;

public class Novice {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Total number of customers: ");
    int total = sc.nextInt();
    List<String> firsts = new ArrayList<>();
    List<String> lasts = new ArrayList<>();
    List<Double> costs = new ArrayList<>();
    for (int i = 0; i < total; i += 1){
        System.out.print("Customer First Name: ");
        String first = sc.next();
        firsts.add(first);
        System.out.print("Customer Last Name: ");
        String last = sc.next();
        lasts.add(last);
        System.out.print("Number of items purchased: ");
        int items = sc.nextInt();
        double cost = 0;
        for(int j = 0; j < items; j += 1) {
            System.out.print("Item Quantity: ");
            int numb = sc.nextInt();
            System.out.print("Item Type: ");
            String item = sc.next();
            System.out.print("Item Price: ");
            double price = sc.nextDouble();
            cost += price * numb;
        }
        costs.add(cost);
    }
    for(int k = 0; k < total; k  += 1){
        String fn = firsts.get(k);
        System.out.println(fn.charAt(0) + ". " + lasts.get(k) + ":  " + costs.get(k));
    }
    }
}
