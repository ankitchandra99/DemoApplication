package com.acciojob.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositoryClass {

    HashMap<Integer,List<TravelList>> travelListHashMap=new HashMap<>();

    public String addTravelListItem(TravelList travelListItem){
        int primaryKey=travelListItem.getUserId();

        List<TravelList> travelItems=travelListHashMap.get(primaryKey);
        travelItems.add(travelListItem);
        travelListHashMap.put(primaryKey,travelItems);

        return "Travel List Item has been added to bucket List" ;
    }

    public List<TravelList> getTravelListDetails(Integer userId){
        return travelListHashMap.getOrDefault(userId,new ArrayList<>());
    }
}
