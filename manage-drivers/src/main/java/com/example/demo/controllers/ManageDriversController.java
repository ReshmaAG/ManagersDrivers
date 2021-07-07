package com.example.demo.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bl.ManageDriversBL;
import com.example.demo.dl.ManageDriversDL;
import com.example.demo.entity.DriverInfo;
import com.example.demo.repository.ManageDriversRepository;

@RestController
@RequestMapping(path = "/manage/drivers")
public class ManageDriversController {
	
	@Autowired
	private ManageDriversBL manageDriversBL;
	
	@Autowired
	private ManageDriversDL manageDriversDL;
	
	@Autowired
	private ManageDriversRepository repo;
	
	
	// This method is used to get all the driver details//
	@GetMapping(path = "/list")
	public ResponseEntity<List<DriverInfo>> getAllDrivers() {
		
		List<DriverInfo> driverList = this.manageDriversBL.findByIsDeleted('0');
		return ResponseEntity.status(HttpStatus.OK).body(driverList);

	}
	//End of get all driver details method//
	
	//This method is used to add a driver to the list//
//	@PostMapping(path = "/add/newdriver")
//	public ResponseEntity<DriverInfo> addDriverDetails(@RequestBody DriverInfo driverInfo){
//		
//		DriverInfo reqDriver = driverInfo;
//		reqDriver.setIsDeleted('0');
//		
//		DriverInfo createdBy = driverInfo;
//		createdBy.setCreatedBy("Admin");
//		
//		DriverInfo createdDate = driverInfo;
//		createdDate.setCreatedDate(LocalDate.now());
//		
//		driverInfo.setDriverId(repo.count()+1);
//		long driverId = driverInfo.getDriverId();
//		Optional<DriverInfo> entity = repo.findById(driverId);
//		DriverInfo saveDriverInfo = null;
//		Long number = driverInfo.getDriverNumber();
//		Optional<DriverInfo> entitynum = repo.findByDriverNumber(number);
//		
//		String license = driverInfo.getLicenseNumber();
//		Optional<DriverInfo> entitylic = repo.findByLicenseNumber(license);
		
//		if(entity.isPresent()) {
//			
//			boolean isNumberAvailable = manageDriversBL.isNumberAvailable(driverInfo);
//			
//			boolean isLicenseAvailable = manageDriversBL.isLicenseAvailable(driverInfo);
//			
//			if(isNumberAvailable) {
//				
//				//saveDriverInfo = this.manageDriversDL.saveDriverDetails(driverInfo);
//				
//				return new ResponseEntity<>(null,HttpStatus.FOUND);
//			}
//				
//				else if(isLicenseAvailable) {
//					
//					//saveDriverInfo = this.manageDriversDL.saveDriverDetails(driverInfo);
//					
//					return new ResponseEntity<>(null,HttpStatus.CONFLICT);
//					
//				}
//				
//				else if(isNumberAvailable && isLicenseAvailable) {
//					
//					return new ResponseEntity<>(null,HttpStatus.ALREADY_REPORTED);
//		
//			}
//					
//		}	
//
//		else {
//	
//			
//			saveDriverInfo = this.manageDriversBL.addDriverDetails(driverInfo);
//
//			return ResponseEntity.status(HttpStatus.CREATED).body(saveDriverInfo);
//		}	
//		
//		
//		}
			//return new ResponseEntity<>(null,HttpStatus.ALREADY_REPORTED);
			//throw new NoSuchElementException("Driver with this number or license number already exist");
			
//		else if(entitylic.isPresent()) {
//			
//			return new ResponseEntity<>(null,HttpStatus.FOUND);
//			//throw new NoSuchElementException("Driver with this number or license number already exist");
//			
//		}
//		else if(entitynum.isPresent() && entitylic.isPresent()) {
//			return new ResponseEntity<>(null,HttpStatus.CONFLICT);
//		}
//		
//		else {
//		
//	
//			
//			saveDriverInfo = this.manageDriversBL.addDriverDetails(driverInfo);
//
//			return ResponseEntity.status(HttpStatus.CREATED).body(saveDriverInfo);
//			
//		}
//		}
			
//			boolean isNumberAvailable = manageDriversBL.isNumberAvailable(driverInfo);
//			
//			boolean isLicenseAvailable = manageDriversBL.isLicenseAvailable(driverInfo);
//			
//			if(isNumberAvailable) {
//				
//				saveDriverInfo = this.manageDriversDL.saveDriverDetails(driverInfo);
//				
//				if(isLicenseAvailable) {
//					
//					saveDriverInfo = this.manageDriversDL.saveDriverDetails(driverInfo);
//					
//				}
//				
//				else {
//					
//					throw new NoSuchElementException("License Number already exits");
//					
//				}
//				
//			}
//			else {
//				
//				throw new NoSuchElementException("Driver Number already exist");
//				
//			}
						
		
		
		
	
	//End of adding the driver to the list method//
	
	//This method is used to update the driver details in the list//
//	@PutMapping(path = "/edit")
//	public ResponseEntity<DriverInfo> editDriverDetails(@RequestBody DriverInfo updateDriverDetails){
//		
//		DriverInfo isDeleted = updateDriverDetails;
//		isDeleted.setIsDeleted('0');
//		
//		DriverInfo modifiedBy = updateDriverDetails;
//		modifiedBy.setModifiedBy("Admin");
//		
//		DriverInfo modifiedDate = updateDriverDetails;
//		modifiedDate.setModifiedDate(LocalDate.now());
//		
//		Long id = updateDriverDetails.getDriverId();
//		
//		Optional<DriverInfo> entity = repo.findById(id);
//		DriverInfo saveDriverInfo = null;
//		
//		//if(entity.isPresent()) {
//			
//			//throw new NoSuchElementException("Driver with this number already exist");
//			
//		//}
//		
//		//else {
//			
//			saveDriverInfo = this.manageDriversBL.addDriverDetails(updateDriverDetails);
//
//			boolean isNumberAvailable = manageDriversBL.isNumberAvailable(updateDriverDetails);
//			
//			boolean isLicenseAvailable = manageDriversBL.isLicenseAvailable(updateDriverDetails);
//			
//			if(isNumberAvailable) {
//				
//				saveDriverInfo = this.manageDriversDL.saveDriverDetails(updateDriverDetails);
//				
//				if(isLicenseAvailable) {
//					
//					saveDriverInfo = this.manageDriversDL.saveDriverDetails(updateDriverDetails);
//					
//				}
//				
//				else {
//					
//					throw new NoSuchElementException("License Number already exits");
//					
//				}
//				
//			}
//			else {
//				
//				throw new NoSuchElementException("Driver Number already exist");
//				
//			}
//						
//			
//		//}
//		
//		return ResponseEntity.status(HttpStatus.CREATED).body(saveDriverInfo);
//		
//	}
	
	//This method is used to delete the driver details//
	@PutMapping(path = "/deletedriver/{driverId}")
	public ResponseEntity<DriverInfo> deleteDriver(@PathVariable("driverId") Long driverId){
				
		DriverInfo info = this.manageDriversBL.deleteDriverDetails(driverId);
		
		return ResponseEntity.status(HttpStatus.OK).body(info);
		
	}
	//End of delete method//
	
//	@GetMapping("/count")
//	public long getTotalCount() {
//		return manageDriversBL.getRecordCount();
//	}
	
	@PostMapping(path = "/add/newdriver")
	public ResponseEntity<DriverInfo> addDriverInfo(@RequestBody DriverInfo driverInfo){
		
		DriverInfo reqDriver = driverInfo;
		reqDriver.setIsDeleted('0');
		
		DriverInfo createdBy = driverInfo;
		createdBy.setCreatedBy("Admin");
		
		DriverInfo createdDate = driverInfo;
		createdDate.setCreatedDate(LocalDate.now());
		
		driverInfo.setDriverId(repo.count()+1);
		Long driverId = driverInfo.getDriverId();
		
		Long number = driverInfo.getDriverNumber();
		Optional<DriverInfo> entitynumber = repo.findByDriverNumber(number);
		
		String licNumber = driverInfo.getLicenseNumber();
		Optional<DriverInfo> entitylic = repo.findByLicenseNumber(licNumber);
		
		DriverInfo saveDriverInfo = null;
		
		if(entitynumber.isPresent() && entitynumber.get().getIsDeleted() == '0') {
			
			return new ResponseEntity<>(null, HttpStatus.ALREADY_REPORTED);
		}
		
		else if(entitylic.isPresent() && entitylic.get().getIsDeleted() == '0') {
			
			return new ResponseEntity<>(null, HttpStatus.FOUND);
					
		}
//		else if(entitynumber.isPresent() && entitylic.isPresent()) {
//			
//			return new ResponseEntity<>(null,HttpStatus.CONFLICT);
//			
//		}
		
		else {
			
			saveDriverInfo = this.manageDriversDL.saveDriverDetails(driverInfo);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(saveDriverInfo);
		}
	}
	
	@PutMapping(path = "/edit")
	public ResponseEntity<DriverInfo> editDriverDetails(@RequestBody DriverInfo updateDriverDetails){
		
		
		DriverInfo isDeleted = updateDriverDetails;
		isDeleted.setIsDeleted('0');
		
		DriverInfo modifiedBy = updateDriverDetails;
		modifiedBy.setModifiedBy("Admin");
		
		DriverInfo modifiedDate = updateDriverDetails;
		modifiedDate.setModifiedDate(LocalDate.now());
		
		Long id = updateDriverDetails.getDriverId();
		
		Long number = updateDriverDetails.getDriverNumber();
		Optional<DriverInfo> entitynumber = repo.findByDriverNumber(number);
		
		String licNumber = updateDriverDetails.getLicenseNumber();
		Optional<DriverInfo> entitylic = repo.findByLicenseNumber(licNumber);
		
		Optional<DriverInfo> entity = repo.findById(id);
		DriverInfo updateDriverInfo = null;
		
		
		if(entitynumber.isPresent() && !(entitynumber.get().getDriverId() == updateDriverDetails.getDriverId()) && entitynumber.get().getIsDeleted() == '0') {
			
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
			
		}
		
		else if(entitylic.isPresent() && !(entitylic.get().getDriverId() == updateDriverDetails.getDriverId()) && entitylic.get().getIsDeleted() == '0') {
			
			return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);

		}
		
		else {
				updateDriverInfo = this.manageDriversDL.updateDriverDetails(updateDriverDetails);
				return ResponseEntity.status(HttpStatus.CREATED).body(updateDriverInfo);
		}
	}
}
		
	


	
	
	


