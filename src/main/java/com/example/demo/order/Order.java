package com.example.demo.order;

import java.util.Objects;

public class Order {
    private String orderNum = null;
    private float basePrice = 0.00f;  // euro
    private float deliveryCost = 0.00f; // euro
    private float weight = 0.00f;  // kg
    private String sourceAddr = null;
    private String currentLoc =  null;
    private String destAddr =  null;


    public Order(String orderNum, float basePrice, float weight, String sourceAddr, String destAddr) {
        this.orderNum = orderNum;
        this.basePrice = basePrice;
        this.weight = weight;
        this.sourceAddr = sourceAddr;
        this.currentLoc = sourceAddr;
        calculateDeliveryCost(destAddr);
        this.destAddr = destAddr;

    }

    //THIS IS JUST A CONCEPT ! WOULD NEED TO INTERGREATE WITH GOOGLE CLOUD (MAPS)
    private void calculateDeliveryCost(String destAddr){
        int dest = 0;
        int source = 0;
        float cost = 0.00f;
        int distance = (source - dest);
        float weight = this.getWeight();


        if (Objects.equals(destAddr, "City A") && Objects.equals(sourceAddr, "City C")){
            dest = 1;
            source = 3;
        }

        //distance
        switch (distance) {
            case 1:
                cost = 5.00f;
                break;
            case 2:
                cost = 10.00f;
                break;
            default:
                cost = 0.00f;
        }

        //weight
        if (weight >= 10.00f){
            cost = cost + 10.00f;
            setDeliveryCost(cost);
        }
        else if (weight >= 5.00f){
            cost = cost + 5.00f;
            setDeliveryCost(cost);
        }
        else {
            cost = cost + 2.50f;
            setDeliveryCost(cost);
        }
    }

    public String getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public float getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getDeliveryCost() {
        return this.deliveryCost;
    }

    public void setDeliveryCost(float deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSourceAddr() {
        return this.sourceAddr;
    }

    public void setSourceAddr(String sourceAddr) {
        this.sourceAddr = sourceAddr;
    }

    String getCurrentLoc(){
        if (Objects.equals(currentLoc, "null")){
            currentLoc = "Error when trying to locate your package...";
        }
        return currentLoc;
    }

    void setCurrentrLoc( String val ){
        this.currentLoc = val;
    }

    public String getDestAddr() {
        return destAddr;
    }

    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }
}