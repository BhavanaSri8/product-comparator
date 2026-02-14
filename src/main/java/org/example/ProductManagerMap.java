package org.example;

import javax.swing.plaf.ProgressBarUI;
import java.util.*;
import java.util.stream.Collectors;

public class ProductManagerMap {

    Map<Integer,Product> mpp=new HashMap<>();

    public void addProduct(Product product){
        mpp.put(product.getId(),product);
    }

    public List<Product> filterByName(String name){
        List<Product> li=new ArrayList<>();
        for(Product p:mpp.values()){
            if(p.getpName().equalsIgnoreCase(name)){
                li.add(p);
            }
        }
        return li;
    }

    public List<Product> filterByRating(int rating){
        List<Product> li=new ArrayList<>(mpp.values());
        return (li.stream()
                .filter(r->r.getRating()==rating)
                .toList());
    }

    public List<Product> filterByBrand(String brand){
        List<Product> li=new ArrayList<>();
        for(Product p:mpp.values()){
            if(p.getBrand().equalsIgnoreCase(brand)){
                li.add(p);
            }
        }
        return li;
    }

    public List<Product> filterByCategory(String category){
        List<Product> li=new ArrayList<>();
        for(Product p:mpp.values()){
            if(p.getCategory().equalsIgnoreCase(category)){
                li.add(p);
            }
        }
        return li;
    }

    public List<Product> filterByMinCost(int cost){
        List<Product> li=new ArrayList<>(mpp.values());
        return (li.stream()
                .filter(i->i.getCost()>=cost)
                .toList());
    }

    public List<Product> filterByMaxCost(int cost){
        List<Product> li=new ArrayList<>(mpp.values());
//        int maxCost = mpp.values()
//                .stream()
//                .mapToInt(Product::getCost)
//                .max()
//                .orElse(0);
        return (li.stream()
                .filter(i->i.getCost()<=cost)
                .toList());
    }


    public void display(){
        mpp.values().forEach(System.out::println);
    }

    public List<Product> sortByCost() {
        List<Product> li = mpp.values().stream()
                .sorted(Comparator.comparing(Product::getCost))
                .toList();
       return li;
    }

    public List<Product> sortByCostDescending(){
        List<Product> li=mpp.values().stream()
                .sorted(Comparator.comparing(Product::getCost).reversed())
                .toList();
        return li;
    }

    public List<Product> sortByName(){
        List<Product> li=new ArrayList<>(mpp.values());
        Collections.sort(li,Comparator.comparing(Product::getpName));
        return li;
    }
    public List<Product> sortByNameDescending(){
        List<Product> li=new ArrayList<>(mpp.values());
        Collections.sort(li,Comparator.comparing(Product::getpName).reversed());
        return li;
    }

    public List<Product> sortByDiscount(){
        List<Product> li=new ArrayList<>(mpp.values());
        li.sort(Comparator.comparing(Product::getPercentage));
        return li;
    }

    public List<Product> sortByDiscountDescending(){
        List<Product> li=new ArrayList<>(mpp.values());
        li.sort(Comparator.comparing(Product::getPercentage).reversed());
        return li;
    }

    public List<Product> sortNameUsingStream(){
        return (mpp.values().stream()
                .sorted(Comparator.comparing(Product::getpName)
                .thenComparing(Product::getCost)).toList());
    }

    public Map<Integer,Product> sortByNameDescendingIdAsencending(){
        return (mpp.entrySet().stream().sorted(Map.Entry.<Integer,Product>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry<Integer,Product>::getKey,
                        Map.Entry<Integer,Product>::getValue,
                        (oldEntry,newEntry)->newEntry,
                                LinkedHashMap::new
        )));
    }
    public void menu() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n================ PRODUCT MENU ================");
            System.out.println("1. Display All Products");
            System.out.println("2. Filter By Name");
            System.out.println("3. Filter By Rating");
            System.out.println("4. Filter By Category");
            System.out.println("5. Filter By Brand");
            System.out.println("6. Filter By Min Cost");
            System.out.println("7. Filter By Max Cost");
            System.out.println("8. Sort By Cost");
            System.out.println("9. Sort By Cost Descending");
            System.out.println("10. Sort By Discount");
            System.out.println("11. Sort By Discount Descending");
            System.out.println("12. Sort By Name");
            System.out.println("13. Sort By Name Descending");
            System.out.println("14. Sort Name Using Stream");
            System.out.println("15. Sort By Name Descending Id Ascending");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    display();
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    filterByName(sc.nextLine()).forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter Rating: ");
                    filterByRating(sc.nextInt()).forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Enter Category: ");
                    filterByCategory(sc.nextLine()).forEach(System.out::println);
                    break;

                case 5:
                    System.out.print("Enter Brand: ");
                    filterByBrand(sc.nextLine()).forEach(System.out::println);
                    break;

                case 6:
                    System.out.print("Enter Min Cost: ");
                    filterByMinCost(sc.nextInt()).forEach(System.out::println);
                    break;

                case 7:
                    System.out.print("Enter Max Cost: ");
                    filterByMaxCost(sc.nextInt()).forEach(System.out::println);
                    break;

                case 8:
                    sortByCost().forEach(System.out::println);
                    break;

                case 9:
                    sortByCostDescending().forEach(System.out::println);
                    break;

                case 10:
                    sortByDiscount().forEach(System.out::println);
                    break;

                case 11:
                    sortByDiscountDescending().forEach(System.out::println);
                    break;

                case 12:
                    sortByName().forEach(System.out::println);
                    break;

                case 13:
                    sortByNameDescending().forEach(System.out::println);
                    break;

                case 14:
                    sortNameUsingStream().forEach(System.out::println);
                    break;

                case 15:
                    System.out.println(sortByNameDescendingIdAsencending());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

}
