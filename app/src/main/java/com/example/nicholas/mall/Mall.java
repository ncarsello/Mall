package com.example.nicholas.mall;
package Facility


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

        FacilityMaintenance maintenance = new FacilityMaintenance();
        private String name;
        private List<Store> storeList = new ArrayList<Store>();
        private List<MallEmployee> mallEmployees = new ArrayList<MallEmployee>();



        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void addStore(Store store){
            storeList.add(store);
        }

        public List<Store> getStoreListing(){
            return storeList;
        }

        public void setMaintenance(Store store, String type){
            maintenance.setRequireMaintenance(true, store, type);
            maintenance.sendRequest();
        }

        public void addMallEmployee(MallEmployee employee){
            mallEmployees.add(employee);
        }

        public List<MallEmployee> getMallEmployeeList(){
            return mallEmployees;
        }

    }

}
