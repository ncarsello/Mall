package com.example.nicholas.mall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Mall {

    private boolean isOpen;
    private int numberOfStores;
    private String employee;

    public Mall() {}

    public String getListEmployee() {
        return getListEmployee;
    }

    public void setListEmployee(String listEmployee) {
        this.listEmployee = listEmployee;
    }

    public String getAddNewStore() {
        return getAddNewStore;
    }

    public void setAddNewStore(String addNewStore) {
        this.addNewStore = addNewStore;
    }

    public int getContactInformation() {
        return getContactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    String mallType; //for mall and stores in mall
    String mallName; //for mall and stores in mall
    String employeeName; //for mall employee and store employees
    String employeePosition; // for mall employee and store employees
    private List<Stores> storeList = new ArrayList<Stores>();
    //	private String storeName;
    private Stores store = new Stores();
    private int number;
    private boolean isOpen;

    public void setFacilityType(String type){
        this.mallType = type;
    }
    public String getFacilityType(){
        return mallType;
    }

    public void setFacilityName(String name){
        this.mallName = name;
    }
    public String getFacilityName(){
        return mallName;
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

    public void addStore(Stores mallStore){
//		this.storeList.add(mallStore); // = mallStore;
        this.store = mallStore;
        storeList.add(store);
    }

    public List<Stores> getStore(){
        return storeList;
    }

//	public void setStoreName(String name){
//		getStore().getFacilityName();
//	}

    public void setStoreNumber(int storenumber){
        this.number = storenumber;
        getStore().get(storenumber);
    }

    public Stores getStoreNumber(){
        return getStore().get(number);
    }

    public String getStoreName(){
        return getStoreNumber().getFacilityName();
    }

    public void requireMaintenance(Facility store){
        Maintenance request = new Maintenance();
        getStoreNumber().setIsOpen(false);
        request.checkForMaintenance(store);
    }

    public void setIsOpen(boolean b) {
        this.isOpen = b;

    }
    public boolean getIsOpen() {
        return isOpen;}
}
