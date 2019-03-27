package com.example.nicholas.mall;
package Facility

/**
 * Created by nicholas on 24 February  2019.
 */

public class Department extends Store {

    private String merchandise;

    public int getService() {
        return getService;
    }

    public int getListInventory() {
        return getListInventory();
    }

    public void setListInventory(String merchandise) {
        this.merchandise = merchandise;
    }


    //clerk
    public String getEmployeeRole() {
        return getEmployeeRole;
    }

    public void setEmployeeRole(String clerkrole) {
        this.clerkrole = clerkrole;
    }

    //cashier
    public String getEmployeeRole() {
        return getEmployeeRole;
    }

    public void setEmployeeRole(String cashierrole) {
        this.role = cashierrole;
    }role;
    }

    private String name;
    private String type;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
