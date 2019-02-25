package com.example.nicholas.mall;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestMall {
    @Test
    import java.util.List;

    public class test {

        public storetest() throws Exception {

            //a brand new mall
            Mall mall1 = new Mall();
            mall1.isOpen = True;

            //set up stores
            ToyStore toyStore1 = new toyStore();
            ToyStore.setContactInformation(13);
            ToyStore.setEmployeeRoles("Sell toys and Hello Kitty stuff");
            ToyStore.setListInventory("Hello Kitty stuff, other toys");

            Department departmentstore1 = new department();
            Department.setContactInformation(1);
            Department.setEmployeeRoles("Sell everything");
            Department.setListInventory("electronics, clothes, appliances");

            //set up another store
            Restaurant restaurant1 = new restaurant();
            Restaurant.setListInventory(10);
            Restaurant.setEmployeeRoles("Cook food");
            Restaurant.setListInventory("Beans, avocados");

            //set up another store
            Restaurant restaurant2 = new restaurant();
            Restaurant.setListInventory(12);
            Restaurant.setEmployeeRoles("Cook pastries");
            Restaurant.setListInventory("Donuts, unhealthy stuff");

            //make Employee
            Employee.setName("qwerty");
            Employee.setAge(22);
            Employee.returnName("qwerty");
            Employee.returnAge(22);
        }
    }
}
