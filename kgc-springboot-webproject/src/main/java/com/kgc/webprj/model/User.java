package com.kgc.webprj.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {

	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	private Long id;
	
	@Column(nullable = false, length = 20)
	private String username;
	
	@Column(nullable = false, length = 100)
	private String password;
	
	@Column(nullable = false)
	private String email;
	
	@ColumnDefault("'user'")
	private String role; // 추후 Enum 으로 변경
	
	@CreationTimestamp // 시간자동입력
	private Timestamp createDate;
}
