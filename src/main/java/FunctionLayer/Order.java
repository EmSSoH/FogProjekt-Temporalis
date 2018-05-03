/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.sql.Date;

/**
 *
 * @author Magnus West Madsen
 */
public class Order {
    
    private int orderId, status, carportLength, carportWidth,incline, shedLength, shedWidth, price, roofType , userId, delivery ;
    private String comment;
    private Date date;

    public Order(int orderId, Date date, int status){
        this.orderId = orderId;
        this.date = date;
        this.status = status;
    }
    
    public Order(int orderId, Date date, int status, int carportLength, int carportWidth, int incline, int roofType,
            int shedLength, int shedWidth, String comment, int price, int userId, int delivery) {
        
        this.orderId = orderId;
        this.date = date;
        this.status = status;
        this.carportLength = carportLength;
        this.carportWidth = carportWidth;
        this.incline = incline;
        this.roofType = roofType;
        this.shedLength = shedLength;
        this.shedWidth = shedWidth;
        this.comment = comment;
        this.price = price;
        this.userId = userId;
        this.delivery = delivery;
    }

    
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
        
        
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCarportLength(int carportLength) {
        this.carportLength = carportLength;
    }

    public void setCarportWidth(int carportWidth) {
        this.carportWidth = carportWidth;
    }

    public void setIncline(int incline) {
        this.incline = incline;
    }

    public void setShedLength(int shedLength) {
        this.shedLength = shedLength;
    }

    public void setShedWidth(int shedWidth) {
        this.shedWidth = shedWidth;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRoofType(int roofType) {
        this.roofType = roofType;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getOrderId() {
        return orderId;
    }

    public Date getDate() {
        return date;
    }

    public int getStatus() {
        return status;
    }

    public int getCarportLength() {
        return carportLength;
    }

    public int getCarportWidth() {
        return carportWidth;
    }

    public int getIncline() {
        return incline;
    }

    public int getShedLength() {
        return shedLength;
    }

    public int getShedWidth() {
        return shedWidth;
    }

    public int getPrice() {
        return price;
    }

    public int getRoofType() {
        return roofType;
    }

    public int getUserId() {
        return userId;
    }

    public int getDelivery() {
        return delivery;
    }

    public String getComment() {
        return comment;
    }

    
    
}
