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

    public List<Product> sortNameUsingStream(){
        return (mpp.values().stream()
                .sorted(Comparator.comparing(Product::getpName)
                .thenComparing(Product::getCost)).toList());
    }

    public Map<Integer,Product> sortByNameDescendingIdDescending(){
        return (mpp.entrySet().stream().sorted(Map.Entry.<Integer,Product>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry<Integer,Product>::getKey,
                        Map.Entry<Integer,Product>::getValue,
                        (oldEntry,newEntry)->newEntry,
                                LinkedHashMap::new
        )));
    }

}
