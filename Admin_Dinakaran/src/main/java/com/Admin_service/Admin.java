package com.Admin_service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
		@Id
		@Column(name="cid")
		private int cid;

		@Column(name="cname")
		private String cname;
		
		@Column(name="address")
		private String address;
		
		@Column(name="gender")
		private String gender;
		
		@Column(name="age")
		private int age;
		
		@Column(name="pass")
		private String pass;

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		@Override
		public String toString() {
			return "Admin [cid=" + cid + ", cname=" + cname + ", address=" + address + ", gender=" + gender + ", age="
					+ age + ", pass=" + pass + "]";
		}
		
		
		
}

		
