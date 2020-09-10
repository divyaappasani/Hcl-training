package com.overloadex;

public class Stall {
		protected String name,detail,ownerName;
		public Stall() {
			
		}
		public Stall(String name, String detail, String ownerName) {
			super();
			this.name = name;
			this.detail = detail;
			this.ownerName = ownerName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public Double computeCost(String stallType,Integer squareFeet) {
			double c;
			if(stallType.equals("platinum")) {
				c=squareFeet*200;
				return c;
			}
			else if(stallType.equals("Diamond")) {
				c=squareFeet*150;
				return c;
			}
			else{
				c=squareFeet*100;
				return c;
			}
		}
		public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
			double c;
			if(stallType.equals("Platinum")) {
				c=(squareFeet*200)+(numberOfTV*10000);
				return c;
			}
			else if(stallType.equals("Diamond")) {
				c=(squareFeet*150)+(numberOfTV*10000);
				return c;
			}
			else{
				c=(squareFeet*100)+(numberOfTV*10000);
				return c;
			}
			
		}


}
