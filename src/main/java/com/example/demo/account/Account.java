package com.example.demo.account;

import com.example.demo.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Account {
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "student_sequence"
	)
	private Integer accNO;

	@OneToOne
	private User user;

	@Column
	private Integer balance;

	@Column
	private String userName;

	public Account() {
	}

	public Account(User user, Integer accNO, Integer balance, String userName) {
		super();
		this.user = user;
		this.accNO = accNO;
		this.balance = balance;
		this.userName = userName;
	}
	
	public Account(Integer balance, String userName) {
		super();
		this.balance = balance;
		this.userName = userName;
	}
	
	public Account(User user, Integer balance, String userName) {
		super(); 
		this.user = user; 
		this.balance = balance; 
		this.userName = userName; 
	}

	public Integer getAccNO() {
		return accNO;
	}

	public void setAccNO(Integer accNO) {
		this.accNO = accNO;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account [user=" + user + ", accNO=" + accNO + ", balance=" + balance + "]";
	}
}
