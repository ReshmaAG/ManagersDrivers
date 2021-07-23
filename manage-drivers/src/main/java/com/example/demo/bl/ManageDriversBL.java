package com.example.demo.bl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dl.ManageDriversDL;
import com.example.demo.entity.DriverInfo;

@Component
public class ManageDriversBL {
	
	@Autowired
	private ManageDriversDL manageDriversDL;
	
	//This method is used to validate the driver number//
	public boolean isNumberAvailable(DriverInfo info1) {
			
		Long id = info1.getDriverId();
		Optional<DriverInfo> entity1 = manageDriversDL.findDriverById(id);
			
		if(entity1.isPresent() && !(entity1.get().getDriverNumber() == (info1.getDriverNumber()))) {
				
			return false;
				
		}
			
		return true;
	}
	//End of validating the driver number method//
	
	//This method is used to validate the license number//
	public boolean isLicenseAvailable(DriverInfo info2) {
		
		Long id = info2.getDriverId();
		Optional<DriverInfo> entity2 = manageDriversDL.findDriverById(id);
		
		if(entity2.isPresent() && !(entity2.get().getLicenseNumber().equals(info2.getLicenseNumber()))) {
			
			return false;
			
		}
		
		return true;
	}
	//End of validating the license number//
	
	//This method is used to get the driver details//
	public List<DriverInfo> getAllDrivers(){
			
		return this.manageDriversDL.findAllDrivers();
			
	}	
	//End of get all driver details//
	
	//This method is used to add a new driver to the list//
	public DriverInfo addDriverDetails(DriverInfo driverDetails) {
		
		return this.manageDriversDL.saveDriverDetails(driverDetails);
		
	}
	//End of the save details method//
	
	//This method is used to update the driver details in the list//
	public DriverInfo editDriverDetails(DriverInfo driverDetails) {
		
		return this.manageDriversDL.updateDriverDetails(driverDetails);
		
	}
	//End of updating the driver details method//
	
	//This method is used to delete the driver details from the list//
	public DriverInfo deleteDriverDetails(Long driverId) {
		
		return this.manageDriversDL.deleteDriverDetails(driverId);
		
	}
	
	//End of the delete method//
	
	//This method is used to fetch the driver details omitting the deleted details//
	public List<DriverInfo> findByIsDeleted(int i){
		
		return this.manageDriversDL.findByIsDeleted(i);
		
	}
	//End of the method//
	

}
