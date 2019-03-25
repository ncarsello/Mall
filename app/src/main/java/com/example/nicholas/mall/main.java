package com.example.nicholas.mall;

import Facility.ClothingStore;
import Facility.Mall;
import Facility.Stores;
import FacilityUse.FacilityUse;
import FacilityMaintenance.Maintenance;
import Stores.Store;

public class Main {
    public static void main(String []args){
        Mall mall = new Mall();

        mall.setFacilityName("Old Orchard");
        mall.setFacilityType("Mall");
        mall.setEmployeeName("Bill");
        mall.setEmployeePosition("Janitor");

        ClothingStore ross = new ClothingStore();
        ross.setEmployeeName("Bobby");
        ross.setEmployeePosition("Cashier");
        ross.setFacilityName("Ross");
        ross.setIsOpen(true);
        ross.setRequireMaintenance(true);

        System.out.println("++++++++++" + mall.getFacilityName() + " " + mall.getFacilityType() + "++++++++++");
        mall.addStore(ross);
        mall.getStoreName();
        mall.getStoreNumber();
        System.out.println(mall.getStoreName());
        System.out.println(mall.getStoreNumber().getIsOpen());
        mall.requireMaintenance(ross);
//		System.out.println(mall.getStore().getIsOpen());
//		mall.requireMaintenance(ross);
//		System.out.println(mall.getStoreName());
//		mall.getStoreList().get(0).setFacilityName("Ross");
//		System.out.println(mall.getStoreList().get(0).getFacilityName());
    }
}
