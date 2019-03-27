package Facility;
package Facility

import java.util.*;

public class ClothingStore extends Stores{
    private boolean requireMaintenance;
//	private List<String> merchandise = new ArrayList<String>();

    public void setRequireMaintenance(boolean yes){
        this.requireMaintenance = yes;
    }
    public boolean getRequireMaintenance(){
        return requireMaintenance;
    }

//	public void addMerchandise(String name){
//		merchandise.add(name);
//	}
//
//	public List<String> getMerchandise(){
//		return merchandise;
//	}
}
