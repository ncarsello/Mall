package com.example.nicholas.mall;

package FacilityMaintenance;

import Facility.Facility;
import Facility.Stores;

public class PerformMaintenance {

    private boolean receivedRequest;

    public void setRequest(boolean request){
        this.receivedRequest = request;
    }
    public boolean getRequest(){
        return receivedRequest;
    }

    public void performingMaintenace(Facility store){
        store.setIsOpen(false);
        if(store.getIsOpen() == false && receivedRequest == true){
            System.out.println(store.getFacilityName() + " required maintenance and is now closed.");
        }
        else if(store.getIsOpen() == false){
            System.out.println(store.getFacilityName()+ " is closed.");
        }
    }

}
