package com.boogy.sandbox.domain;

public class House {
    private Integer yearBuilt;
    private String address;

    public House() {


    }


    public House(Integer yearBuilt, String address) {
        this.yearBuilt = yearBuilt;
        this.address = address;

    }

    //region getters
    public int getYearBuilt() {
        return this.yearBuilt;
    }

    public String getAddress() {
        return this.address;
    }
    //endregion getters

    //region setters
    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //endregion setters

}
