package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "managedrivers")
public class DriverInfo {

	@Id
	long driverId;
	
//	@Id
//	ObjectId driverId;
	
	String driverName;
	Long driverNumber;
	String licenseNumber;
	LocalDate expiryDate;
	char isDeleted;
	String createdBy;
	String modifiedBy;
	LocalDate createdDate;
	LocalDate modifiedDate;
	
	
	public DriverInfo(String driverName, Long driverNumber, String licenseNumber, LocalDate expiryDate, char isDeleted,
			String createdBy, String modifiedBy, LocalDate createdDate, LocalDate modifiedDate) {
		super();
		this.driverName = driverName;
		this.driverNumber = driverNumber;
		this.licenseNumber = licenseNumber;
		this.expiryDate = expiryDate;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}
	
//	public ObjectId getId() {
//		return driverId;
//	}
//
//	public void setId(ObjectId driverId) {
//		this.driverId = driverId;
//	}
	
//	public DriverInfo(Integer driverId, String driverName, Integer driverNumber, String licenseNumber,
//			Date expiryDate) {
//		super();
//		this.driverId = driverId;
//		this.driverName = driverName;
//		this.driverNumber = driverNumber;
//		this.licenseNumber = licenseNumber;
//		this.expiryDate = expiryDate;
//	}
	
	
	
	
	

}
