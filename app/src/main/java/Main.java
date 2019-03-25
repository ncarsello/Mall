import java.util.ArrayList;
import java.util.List;
import com.example.Mall.*;
import com.example.Employees.*;
import com.example.Stores.*;
import Facility.ClothingStore;
import Facility.Mall;
import Facility.Stores;
import FacilityUse.FacilityUse;
import FacilityMaintenance.Maintenance;
import Stores.Store;
import com.example.nicholas.mall.Mall;

public class main {
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

        Mall mall = new Mall();
        ArrayList<Store> mallStores = new ArrayList<Store>();

        Store toyStore = new ToyStore();
        toyStore.setStoreName("Toys R Us");
        toyStore.setStoreType("Toy Store");
        toyStore.setAddEmployee("Bob");
        toyStore.setEmployeeAge(18);
        toyStore.setEmployeeRole("cashier");
        toyStore.setContactInformation("ToysRUs@mail.com");
        toyStore.setMerchandise("Sells Toys");
        toyStore.setStoreLocation("1234 South of Mall");

        Store restaurant = new Restaurant();
        restaurant.setStoreName("Red Lobster");
        restaurant.setStoreType("Food");
        restaurant.setAddEmployee("Bill");
        restaurant.setEmployeeAge(19);
        restaurant.setEmployeeRole("chef");
        restaurant.setContactInformation("RedLobster@mail.com");
        restaurant.setMerchandise("Delicious food");
        restaurant.setStoreLocation("2345 South of Mall");

        Store clothing = new Restaurant();
        clothing.setStoreName("Ross");
        clothing.setStoreType("Clothing");
        clothing.setAddEmployee("Billy");
        clothing.setEmployeeAge(18);
        clothing.setEmployeeRole("cashier");
        clothing.setContactInformation("Ross@mail.com");
        clothing.setMerchandise("Stylish Clothes");
        clothing.setStoreLocation("3456 South of Mall");

        Store entertainment = new Restaurant();
        entertainment.setStoreName("Radio Shack");
        entertainment.setStoreType("Entertainment");
        entertainment.setAddEmployee("Bobby");
        entertainment.setEmployeeAge(17);
        entertainment.setEmployeeRole("cashier");
        entertainment.setContactInformation("RadioShack@mail.com");
        entertainment.setMerchandise("Cool Music");
        entertainment.setStoreLocation("4567 South of Mall");

        Store departmentStore = new DepartmentStore();
        departmentStore.setStoreName("Target");
        departmentStore.setStoreType("Department Store");
        departmentStore.setAddEmployee("Beatrice");
        departmentStore.setEmployeeAge(25);
        departmentStore.setEmployeeRole("cashier");
        departmentStore.setContactInformation("Target@mail.com");
        departmentStore.setMerchandise("Lots of stuff");
        departmentStore.setStoreLocation("5678 South of Mall");

        mallStores.add(toyStore);
        mallStores.add(restaurant);
        mallStores.add(clothing);
        mallStores.add(entertainment);
        mallStores.add(departmentStore);

        mall.setIsMallOpen(true);
        mall.setMallName("LincolnWood Mall");
        if(mall.getIsMallOpen() == true){

            System.out.println("Welcome to " + mall.getMallName());
            System.out.println("Here you will find:");
            for(Store x : mallStores){
                int i = 0;
                i++;
                System.out.println(x.getStoreName()
                        + ", it is a " + x.getStoreType() + " store"
                        + ", Located at: " + x.getStoreLocation()
                        +", has: " + x.getMerchandise()
                        +", you can contact them at: " + x.getContactInformation()
                        + ", their employee is " + x.getEmployeeRole() + ": " + x.getAddEmployee()
                        +", is " + x.getEmployeeAge() + " years old");
                System.out.println("");
            }
        }

        System.out.println("We will be closing in 5 minutes for maintenance");
        mall.setIsMallOpen(false);
        if(mall.getIsMallOpen() == false){
            mall.setMallStatus("Closed");
            System.out.println(mall.getMallStatus());
            mall.setDetails("Checking for rats, bugs, and other pests");
            System.out.println(mall.getDetails());
        }

        mall.setCost(50);
        System.out.println("Cost of maintenance is: $" + mall.getCost());

        mall.setVacateStoreSpace(restaurant);
        System.out.println("vacating store causing problems: " + mall.getVacateStoreSpace().getStoreName());

        mall.setLeaseStoreSpace(restaurant);
        mall.getLeaseStoreSpace().setStoreName("Olive Garden");
        System.out.println("Leasing new store: " + mall.getLeaseStoreSpace().getStoreName());

        mall.setCost(50);
        System.out.println("Cost of maintenance is: $" + mall.getCost());

        mall.setVacateStoreSpace(restaurant);
        System.out.println("vacating store causing problems: " + mall.getVacateStoreSpace().getStoreName());

        mall.setLeaseStoreSpace(restaurant);
        mall.getLeaseStoreSpace().setStoreName("Olive Garden");
        System.out.println("Leasing new store: " + mall.getLeaseStoreSpace().getStoreName());


//		mall.setAddStore(toyStore);
//		mall.setIsMallOpen(true);

//		System.out.println(mall.getAddStore().get);
    }
}
