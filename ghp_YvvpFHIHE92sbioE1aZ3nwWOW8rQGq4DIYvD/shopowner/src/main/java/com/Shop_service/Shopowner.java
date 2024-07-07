package com.Shop_service;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shopowner {
		@Id
		@Column(name="cid",nullable = false,unique = true)
		private int cid;

		@Column(name="cname",nullable = false)
		private String cname;
		
		@Column(name="address",nullable = false)
		private String address;
		
		@Column(name = "email",nullable = false)
		private String email;
		
		@Column(name="pass",nullable = false)
		private String pass;

		public Shopowner() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Shopowner (int cid, String cname, String pass, String email, String address) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.pass = pass;
			this.email = email;
		
			this.address = address;
		}
		
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}
		@Override
		public String toString() {
			return "Shopowner [cid=" + cid + ", cname=" + cname + ", address=" + address + ", email=" + email
					+ ", pass=" + pass + "]";
		}

		
		
		
}

		
