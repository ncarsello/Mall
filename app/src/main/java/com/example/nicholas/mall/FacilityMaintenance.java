package com.example.nicholas.mall;

/**
 * Created by nicholas on 12 March  2019.
 */

public interface FacilityMaintenance

{

    private String details;
    private int cost;

    public Maintenance() {}

    public String getDetails() {
        return details;
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

    public object scheduleMaintenence();

    public object openStore();

	public object closeStore();

	public object janiorCleaning();

	public object securityChecks();

}
