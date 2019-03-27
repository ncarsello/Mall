import Employees.MallEmployee;
import Facility.ClothingStore;
import Facility.DepartmentStore;
import Facility.Facility;
import Facility.Mall;
import Facility.Restaurant;
import Facility.Store;
import FacilityUse.Employee;
import FacilityUse.MallEmployee;


public class Main {
    public static void main(String [] args){
        Mall mallFacility = new Mall();
        MallEmployee Bill = new MallEmployee();
        Bill.addEmployee("Bill", "Janitor");

        Store ross = new ClothingStore();
        ross.setName("Ross");
        ross.setType("Clothing Store");

        Store target = new DepartmentStore();
        target.setName("Target");
        target.setType("Department Store");

        Store redLobster = new Restaurant();
        redLobster.setName("Red Lobster");
        redLobster.setType("Restaurant");

        mallFacility.addStore(ross);
        mallFacility.addStore(target);
        mallFacility.addStore(redLobster);
        System.out.println(mallFacility.getStoreListing().get(0).getName());
        mallFacility.setMaintenance(mallFacility.getStoreListing().get(0), mallFacility.getStoreListing().get(0).getType());
        System.out.println(mallFacility.getStoreListing().get(1).getName());
        mallFacility.setMaintenance(mallFacility.getStoreListing().get(1), mallFacility.getStoreListing().get(1).getType());
        System.out.println(mallFacility.getStoreListing().get(2).getName());
        mallFacility.setMaintenance(mallFacility.getStoreListing().get(2), mallFacility.getStoreListing().get(2).getType());
        mallFacility.addMallEmployee(Bill);
        System.out.println(mallFacility.getMallEmployeeList().get(0).getEmployee() + " " + mallFacility.getMallEmployeeList().get(0).getPosition());

        Employee securityguard = new MallEmployee();
        securityguard.setName("qwerty");
        securityguard.setAge(107);
        securityguard.setRole("Food Court Security");

        Employee janitor = new MallEmployee();
        janitor.setName("asdfg");
        janitor.setAge(200);
        janitor.setRole("Department Store Janitor");

//		mallFacility.setEmployee("Bob", "Janitor");
//		mallFacility.addEmployee();
//		mallFacility.setEmployee("Bill", "Security");
//		mallFacility.addEmployee();
//		System.out.println(mallFacility.getEmployee().getName() + " " + mallFacility.getEmployee().getPosition());
//		System.out.println(mallFacility.getMallEmployeeList().get(0).getName());
    }
}
