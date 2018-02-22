package com.bike.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BikeEntity {
		
		@Id
		private String regNo;
		private String name;
		private String bikeCompany;
		private String bikeModel;
		private int engineNo;

		public String getRegNo() {
			return regNo;
		}

		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBikeCompany() {
			return bikeCompany;
		}

		public void setBikeCompany(String bikeCompany) {
			this.bikeCompany = bikeCompany;
		}

		public String getBikeModel() {
			return bikeModel;
		}

		public void setBikeModel(String bikeModel) {
			this.bikeModel = bikeModel;
		}

		public int getEngineNo() {
			return engineNo;
		}

		public void setEngineNo(int engineNo) {
			this.engineNo = engineNo;
		}

}
