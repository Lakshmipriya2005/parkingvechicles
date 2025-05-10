package parkingvechicles;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetails {
List<customer> customers;
CustomerDetails(){
	customers=new ArrayList<>();
}
	public void addDetails(customer customer1) {
		customers.add(customer1);
		
	}
	void displayAllCustomer() {
	    for (customer i : customers) {
	        System.out.print("customer name is " + i.getName() +
	                         " \ncustomer phone number is " + i.getPhone_num() +
	                         " \ncustomer vehicle type is " + i.getVehicleType() +
	                         " \nToken " + i.getToken() +
	                         " \ncustomer status " + i.getStatus() +
	                         "\n| ");
	    }
	}


	public boolean isAvailable(int token,parkingLot plot) {
	     for(customer i:customers) {
	    	 if(i.getToken()==token) {
	    		if( plot.customerunPark(i.getVehicleType(),i.getFloorHeparked())) {
	    		i.token=-1;
	    		i.setStatus("unparked");
	    		return true;
	    		}
	
	    		 
	    	 }
	    	 
	     }
		return false;
		
	}

}
