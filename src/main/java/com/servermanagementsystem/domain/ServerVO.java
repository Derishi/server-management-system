package com.servermanagementsystem.domain;

public class ServerVO {

    private String id;
    private String name;
    private String region;
    private String customer;

    public ServerVO(String id, String name, String region, String customer) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
