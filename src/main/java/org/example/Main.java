package org.example;

import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManagerMap pm=new ProductManagerMap();

        pm.addProduct(new Product(1, "Sony Bravia TV", 55000, "Sony", "Electronics", 5, 12));
        pm.addProduct(new Product(2, "LG Refrigerator", 42000, "LG", "Home Appliance", 4, 18));
        pm.addProduct(new Product(3, "Whirlpool Washing Machine", 35000, "Whirlpool", "Home Appliance", 4, 15));
        pm.addProduct(new Product(4, "Canon DSLR Camera", 65000, "Canon", "Electronics", 5, 10));
        pm.addProduct(new Product(5, "Samsung Soundbar", 18000, "Samsung", "Electronics", 4, 20));


        pm.menu();
//
//        System.out.println("\nAll products: ");
//        pm.display();
//
//
//        System.out.println("\n===========================================================================");
//
//        System.out.println("\nFilter By Name: ");
//        List<Product> filterName=pm.filterByName("Whirlpool Washing Machine");
//        for(Product p:filterName){
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//        System.out.println("\nFilter By Rating: ");
//        List<Product> rate=pm.filterByRating(4);
//        for(Product p:rate){
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//        System.out.println("\nFilter By Category: ");
//        // System.out.println(pm.filterByCategory("Electronics"));
//        List<Product> filterMap=pm.filterByCategory("Electronics");
//        for(Product p:filterMap){
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//        System.out.println("\nFilter By Brand: ");
//        List<Product> filterBrand=pm.filterByBrand("Sony");
//        for(Product p:filterBrand){
//            System.out.println(p);
//        }
//
//        System.out.println("\n===========================================================================");
//
//        System.out.println("\nFilter By Min Cost: ");
//        List<Product> filterMinC=pm.filterByMinCost(35000);
//        for(Product p:filterMinC){
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//
//        System.out.println("\nFilter By Max Cost: ");
//        List<Product> filterMaxC=pm.filterByMaxCost(65000);
//        for(Product p:filterMaxC){
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//
//        System.out.println("\nSort by Cost: ");
//        List<Product> li=pm.sortByCost();
//        for (Product p : li) {
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//
//        System.out.println("\nSort by Cost Descending: ");
//        List<Product> list=pm.sortByCostDescending();
//        for (Product p : list) {
//            System.out.println(p);
//        }
//
//
//
//        System.out.println("\n===========================================================================");
//
//        System.out.println("\nSort By Discount: ");
//        List<Product> dis=pm.sortByDiscount();
//        for(Product p:dis){
//            System.out.println(p);
//        }
//
//        System.out.println("\n===========================================================================");
//
//
//        System.out.println("\nSort By Discount Descending: ");
//        List<Product> dis1=pm.sortByDiscountDescending();
//        for(Product p:dis1){
//            System.out.println(p);
//        }
//
//        System.out.println("\n===========================================================================");
//
//        System.out.println("\nSort by Name: ");
//        List<Product> list1=pm.sortByName();
//        for (Product p : list1) {
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//
//        System.out.println("\nSort by Name Descending: ");
//        List<Product>  name1=pm.sortByNameDescending();
//        for (Product p : name1) {
//            System.out.println(p);
//        }
//
//
//        System.out.println("\n===========================================================================");
//
//
//        System.out.println("\nSort Name Using Streams: ");
//        List<Product>  n1=pm.sortNameUsingStream();
//        for (Product p : n1) {
//            System.out.println(p);
//        }
//
//        System.out.println("\n===========================================================================");
//
//
//        System.out.println("\nSort By Name Then By Id: ");
//        Map<Integer,Product> mp=pm.sortByNameDescendingIdAsencending();
//        System.out.println(mp);
    }
}