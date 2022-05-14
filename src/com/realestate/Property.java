package com.realestate;

public class Property {
    private String streetName;
    private String streetNumber;
    private String town;
    private Integer value;
    private boolean hasBeenPhotographed;
    private boolean hasBeenInspected;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    private Seller seller;
    private Buyer buyer;

    Property(String streetName, String streetNumber, String town) {
        this.streetName= streetName;
        this.streetNumber = streetNumber;
        this.town = town;
    }
    public String getFullAddress () {
        return (this.streetNumber + " " + this.streetName+ " " + this.town);
    }
}
