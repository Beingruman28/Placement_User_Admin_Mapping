package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin2")

public class Admin {
		@Id
		private int a_id;
		private String name;
		private String passwords;
		
		@OneToOne(mappedBy="admin")
		private User user;
		
		public int getId() {
			return a_id;
		}
		public void setId(int id) {
			this.a_id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return passwords;
		}
		public void setPassword(String password) {
			this.passwords = password;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}

}