package com.example.nicholas.mall;

package FacilityMaintenance;

import Facility.Facility;
import FacilityUse.FacilityUse;

public class Maintenance{
    private boolean isOpen;
    private boolean isUnderMaintenance;
    private String maintenanceDetails;
    PerformMaintenance maintenance = new PerformMaintenance();
    FacilityUse inUse = new FacilityUse();

    public void setIsOpen(boolean open) {
        this.isOpen = open;

    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setUnderMaintenance(boolean maintenance) {
        this.isUnderMaintenance = maintenance;

    }

    public boolean getUnderMaintenance() {
        return isUnderMaintenance;
    }

    public void checkForMaintenance(Facility store){
        maintenance.setRequest(true);
        maintenance.performingMaintenace(store);
    }

}
