package com.example.demo.deliveryvehicle;

import com.example.demo.order.Order;
import java.util.ArrayList;

public abstract class DeliveryVehicle {
    private final String nameOfDriver;
    private final String typeOfVehicle;
    private final String vehicleUID;
    private final ArrayList<Order> ordersStillToBeDelivered;
    private String currentLocation;

    public DeliveryVehicle(String nameOfDriver, String typeOfVehicle, String vehicleUID, ArrayList<Order> ordersStillToBeDelivered){
        this.nameOfDriver = nameOfDriver;
        this.typeOfVehicle = typeOfVehicle;
        this.vehicleUID = vehicleUID;
        this.ordersStillToBeDelivered = ordersStillToBeDelivered;
        this.updateCurrentLocation();
    }

    public abstract void updateCurrentLocation();

    public void removeOrder(Order orderToRemove) {
        if (ordersStillToBeDelivered.contains(orderToRemove)) {
            this.ordersStillToBeDelivered.remove(orderToRemove);
            return;
        }
        System.out.println("Order not in van");
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getVehicleUID() {
        return vehicleUID;
    }

    public ArrayList<Order> getOrdersStillToBeDelivered() {
        return ordersStillToBeDelivered;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
}
