package com.realestate;

public class MakeInstances {

    public static Property makeNewProperty(String streetName, String streetNumber, String town){
        return new Property(streetName, streetNumber, town);
    }

    public static Seller makeNewSeller (String name, String phoneNumber){
        return new Seller(name, phoneNumber);
    }

    public static Buyer makeNewBuyer (String name, String phoneNumber){
        return new Buyer(name, phoneNumber);
    }

}
