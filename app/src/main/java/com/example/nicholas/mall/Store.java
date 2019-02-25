package com.example.nicholas.mall;

/**
 * Created by nicholas on 24 February  2019.
 */

    public class Store extends Mall {

    public String storeType;
    public String contactInformation;
    public String storeLocation;
    public String merchandiseType;
    public String employeeRoles;

        public String storeID() {
            return storeID;
        }

        public void setAddEmployee(String name) {
            this.addEmployee = addEmployee;
        }

        public int getAddEmployee() {
            return getAddEmployee;
        }

        public void setRemoveEmployee(String name) {
            this.name = name;
        }

        public int getRemoveEmployee() {
            return getRemoveEmployee;
        }
        public void setListInventory(String listinventory) {
            this.listInventory = listInventory;
        }

        public int getListInventory() {
            return listInventory;
        }

        public void setEmployeeRole(String role) {
            this.role = role;
        }

        public int getEmployeeRole() {
            return getEmployeeRole;
        }
}
