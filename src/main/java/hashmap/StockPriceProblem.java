package hashmap;

import java.util.HashMap;

public class StockPriceProblem {
    public static void main(String[] args) {

        HashMap<String, Double> stock = new HashMap<>();
        stock.put("apple", 400.90);
        stock.put("tesla", 1200.32);
        stock.put("meta", 300.43);
        stock.put("bofa", 5.5);
        stock.put("slack", 123.54);
        stock.put("mcdonalds", 98.12);


        findTheHighestPrice(stock);
        findTheAveragePrice(stock);
        removeStock(stock, 200.00);

    }

    public static double findTheHighestPrice(HashMap<String, Double> stocks){
        double highest = 0;
        for(String key : stocks.keySet()){
            if(stocks.get(key) > highest){
                highest = stocks.get(key);
            }
        }
        System.out.println("The highest stock: " + highest);
        return highest;
    }

    public static double findTheAveragePrice(HashMap<String, Double> stocks){
        double sum = 0;
        for(String key : stocks.keySet()){
            sum += stocks.get(key);
            }
        double average = sum / stocks.size();
        System.out.printf("The average: " + "%.2f", average);
        System.out.println();
        return average;
    }

    public static HashMap<String, Double> removeStock(HashMap<String, Double> stocks, double minPrice){
        HashMap<String, Double> newStocks = new HashMap<>();
        for(String key : stocks.keySet()){
            if(stocks.get(key) > minPrice){
                newStocks.put(key, stocks.get(key));
            }
        }
        System.out.println("New hashmap: " + newStocks);
        return newStocks;
    }
}
