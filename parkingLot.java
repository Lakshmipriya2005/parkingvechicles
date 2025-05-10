package parkingvechicles;

import java.util.*;

public class parkingLot {
	
     static HashMap<Integer,floor> floors=new HashMap<>();
    
    void addfloortoParkingLot(){
    	int count=floors.size()+1;
    	floor f1=new floor(count);
    	
    	floors.put(count,f1);
    	
    	
    }
 
    void displayTotalFloors() {
    	System.out.println("Total number of floors "+floors.size());
    }

	public void displayAll() {
		for(int i:floors.keySet()) {
			System.out.println(floors.get(i));
		}
		
		
	}

	public floor isFloorAvailable(int floorNo) {
		// TODO Auto-generated method stub
		if(floors.containsKey(floorNo)) {
			return floors.get(floorNo);
		}
		return null;
		
	}
	public int isCustomerCanPark(String vehicletype ) {
		
		int floor=0;
		for(int i:floors.keySet()) {
			floor f=floors.get(i);
			List<parkingSlot> slot=f.slots;
			
			for(parkingSlot j:slot) {
				if(j.slotType.equalsIgnoreCase(vehicletype)  &&j.isAvailable!=false ) {
					j.isAvailable=false;
					floor=i;
					break;
				}
				
			}
				
			
		}
		return floor;
		
	}

	public boolean customerunPark(String vehicletype,int floorHeparked) {

		
		List<parkingSlot> slot=floors.get(floorHeparked).slots;
	
			boolean unparked=false;
			for(parkingSlot j:slot) {
				if(j.slotType.equalsIgnoreCase(vehicletype)  &&j.isAvailable==false) {
					j.isAvailable=true;
					unparked=true;
					break;
				}
				
			}
				
		
		
		return unparked;
	}

	
	
    
}
