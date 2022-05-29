package com.example.demo.customer;

import com.example.demo.general.General;
import com.example.demo.order.Order;
import java.util.ArrayList;

public class Customer {
    private long cid;
    private String forename;
    private String surname;
    private String address;
    private final ArrayList<Order> orderList = new ArrayList<Order>();

    public Customer(String forename, String surname, String address) {
        this.cid = General.newId();
        this.forename = forename;
        this.surname = surname;
        this.address = address;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
