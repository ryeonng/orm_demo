package com.tenco.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "address_tb")
public class Address {

	// @Id : 이 필드는 데이터베이스 테이블의 기본 키(primary key)를 나타낸다.
	// 이 어노테이션은 해당 필드가 엔티티의 고유 식별자임을 나타내며,
	// 데이터베이스 테이블에서 이 필드를 기준으로 레코드를 구분한다.

	// @GeneratedValue(strategy = GenerationType.IDENTITY):
	// 이 어노테이션은 기본 키가 자동으로 생성되도록 설정한다.
	// GenerationType.IDENTITY 전략은 데이터베이스의 "AUTO_INCREMENT" 기능을 사용하여 기본 키 값을 자동으로 생성한다.
	// 따라서, 새로운 엔티티가 데이터베이스에 삽입될 때마다 고유한 ID 값이 자동으로 생성되고 할당된다.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String city;
	private String street;

}
