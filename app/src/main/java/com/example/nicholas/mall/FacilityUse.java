package com.example.nicholas.mall;
package Facility

/**
 * Created by nicholas on 12 March  2019.
 */

public interface FacilityUse {

	public String getUse() {
		return use;
	}

	public boolean storeOpen (String storeOpen) {
		this.storeOpen = storeOpen;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


    public object isStoreOpen();

	public object leaseStoreSpace();

	public object vacateStoreSpace();

	public object listInspection();

}
