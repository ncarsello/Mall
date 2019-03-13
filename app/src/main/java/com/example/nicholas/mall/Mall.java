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
}
