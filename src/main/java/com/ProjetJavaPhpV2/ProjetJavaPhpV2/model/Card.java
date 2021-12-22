package com.ProjetJavaPhpV2.ProjetJavaPhpV2.model;

import lombok.Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Data
public class Card {
    private Map<Integer,OrderedLine> items=new HashMap<Integer, OrderedLine>();
    public void addBook(Book b,int quantity){
        if(items.get(b.getProductId())==null){
            OrderedLine ol=new OrderedLine();
            ol.setBook(b);
            ol.setQuantity(quantity);
            ol.setPrice(b.getPrice());
        }
        else{
            OrderedLine ol=items.get(b.getProductId());
            ol.setQuantity(ol.getQuantity()+quantity);
        }
    }
    public Collection<OrderedLine> getItems(){
        return items.values();
    }
    public double getTotal(){
        double total=0;
        for(OrderedLine ol:items.values()){
            total+=ol.getPrice()*ol.getQuantity();
        }
        return total;
    }
    public int getSize(){
        return items.size();
    }
    public void deleteItem(Integer productId){
        items.remove(productId);
    }
}
