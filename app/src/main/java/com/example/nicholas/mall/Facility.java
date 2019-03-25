package com.example.nicholas.mall;
package Facility;

/**
 * Created by nicholas on 12 March  2019.
 */

public interface Facility {
    public boolean getOpenFacility() {
        return getOpenFacility();
    }

    public void setOpenFacility(String openFacility) {
        this.openFacility = openFacility;
    }

    public boolean getCloseFacility() {
        return getCloseFacility();
    }

    public void setCloseFacility(String closeFacility) {
        this.closeFacility = closeFacility;
    }

    public object listStores();

    public object getStoreInformation(return storeInformation);

    public object setStoreInformation(this.storeInformation=storeinformation);

    public object addNewStore();

    public object addStoreDetail();

    public object removeStore();



    public void setFacilityType(String type);

    public String getFacilityType();

    public void setFacilityName(String name);

    public String getFacilityName();

    public void setEmployeeName(String name);

    public String getEmployeeName();

    public void setEmployeePosition(String position);

    public String getEmployeePosition();

    public void setIsOpen(boolean b);

    public boolean getIsOpen();

}