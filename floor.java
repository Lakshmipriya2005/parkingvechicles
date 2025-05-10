package parkingvechicles;

import java.util.*;

public class floor {
	 int floortoAdd = 0;
	List<parkingSlot> slots = new ArrayList<>();

	floor(int floortoAdd) {
		this.floortoAdd = floortoAdd;
	}

	void addSlot(String slottypes, int noOfSlots) {

		int TotalcountOfslots = 0;
		for (parkingSlot i : slots) {
			TotalcountOfslots += i.slotsNo;
		}
		if (TotalcountOfslots + noOfSlots > 10) {
			System.out.println("Sorry, parking slot limit exceeded for this floor");
			return;
		}
		
		for(int i=0;i<noOfSlots;i++) {
		slots.add(new parkingSlot(1, slottypes));
		}
	}

	void displaySlotForFloor() {
		for (parkingSlot ps : slots) {
			System.out.println("Parking slots for each floor " + ps.slotType + " Total slots " + ps.slotsNo);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Floor Number: ").append(floortoAdd).append("\n");
		for (parkingSlot ps : slots) {
			
			sb.append("  Slot Type: ").append(ps.slotType)
			  .append(", Number of Slots: ").append(ps.slotsNo).append("\n");
		}
		return sb.toString();
	}
}
