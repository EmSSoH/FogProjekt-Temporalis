/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Juste
 */
public class Components {


    private int id, price;
    private String CompName;
    
    public Components (int id, String CompName, int price){
        this.id = id;
        this.CompName = CompName;
        this.price = price;        
    }
    
    public Components(){
        
    }
    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getCompName() {
        return CompName;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCompName(String CompName) {
        this.CompName = CompName;
    }

}
