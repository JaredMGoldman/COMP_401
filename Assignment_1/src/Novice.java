import java.util.*;

public class Novice {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    List<String> firsts = new ArrayList<>();
    List<String> lasts = new ArrayList<>();
    List<Double> costs = new ArrayList<>();
    for (int i = 0; i < total; i += 1){
        String first = sc.next();
        firsts.add(first);
        String last = sc.next();
        lasts.add(last);
        int items = sc.nextInt();
        double cost = 0;
        for(int j = 0; j < items; j += 1) {
            int numb = sc.nextInt();
            String item = sc.next();
            double price = sc.nextDouble();
            cost += price * numb;
        }
        costs.add(cost);
    }
    for(int k = 0; k < total; k  += 1){
        String fn = firsts.get(k);
        System.out.println(fn.charAt(0) + ". " + lasts.get(k) + ":  " + String.format("%.2f", costs.get(k)));
    }
    }
}
