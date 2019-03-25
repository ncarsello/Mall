package com.example.nicholas.mall;

public interface Store {
    //store is an interface because there is a lot of different stores. so make store an interface.
    //whatever class or other interface implements an interface
    // HAS TO implement the methods in whatever the implement that is being implement is.
    //facility interface for facility that MALL implements. a mall is a class. a STORE is an interface but a mall has a list of stores.
    //mall is a class. store is an interface
    //in a mall there is stores. STOREs are also an interface because there are lot of differnet types of stores.
    //think about what it takes to run a facility. put them into classes.

    private String storeType;
    private String contactInformation;
    private String storeLocation;
    private String merchandiseType;
    private String employeeRoles;
    private String storeName; //for mall and stores in mall
    private String employeeName; //for mall employee and store employees
    private String employeePosition; // for mall employee and store employees
    private boolean isOpen;

    public String storeID() {
        return storeID;
    }

    public void setAddEmployee(String name) {
        this.addEmployee = addEmployee;
    }

    public int getAddEmployee() {
        return getAddEmployee;
    }

    public void setRemoveEmployee(String name) {
        this.name = name;
    }

    public int getRemoveEmployee() {
        return getRemoveEmployee;
    }
    public void setListInventory(String listinventory) {
        this.listInventory = listInventory;
    }

    public int getListInventory() {
        return listInventory;
    }

    public void setEmployeeRole(String role) {
        this.role = role;
    }

    public int getEmployeeRole() {
        return getEmployeeRole;
    }

    public void setFacilityType(String type){
        this.storeType = type;
    }
    public String getFacilityType(){
        return storeType;
    }

    public void setFacilityName(String name){
        this.storeName = name;
    }
    public String getFacilityName(){
        return storeName;
    }

    public void setEmployeeName(String name){
        this.employeeName = name;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeePosition(String position){
        this.employeePosition = position;
    }
    public String getEmployeePosition(){
        return employeePosition;
    }

    public void setIsOpen(boolean open){
        this.isOpen = open;
    }
    public boolean getIsOpen(){
        FacilityUse inUse = new FacilityUse();
        return isOpen;
    }
}
