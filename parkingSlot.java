package parkingvechicles;

public class parkingSlot {
	 int slotsNo;
	 String slotType;
	boolean isAvailable;
	public parkingSlot(int slotNo,String slotType){
		this.slotsNo=slotNo;
		this.slotType=slotType;
		isAvailable=true;
		
	}
	public int getSlotsNo() {
		return slotsNo;
	}
	public void setSlotsNo(int slotsNo) {
		this.slotsNo = slotsNo;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	

	
	

}
