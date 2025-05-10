package parkingvechicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class customer {
	private String name;
	private long phone_num;
	private String VehicleType;
	private int floorHeparked;
	private String status;
	 int token=0;
	public customer(String name,long phone_num,String VehicleType,int floorHeparked,String status,CustomerDetails c) {
		this.name=name;
		this.phone_num=phone_num;
		this.VehicleType=VehicleType;
		this.floorHeparked=floorHeparked;
		this.status=status;
		
		token=c.customers.size()+1;
		
		
	}
	
	public int getFloorHeparked() {
		return floorHeparked;
	}

	public void setFloorHeparked(int floorHeparked) {
		this.floorHeparked = floorHeparked;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public int getToken() {
		return token;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}
	
	
	

}
