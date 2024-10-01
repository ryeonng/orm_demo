package com.tenco.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb user") // User : 데이터베이스에서 예약어로 사용되므로, 테이블 이름으로 사용 불가
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	// @OneToOne : User, Address 엔티티 간의 1대1 관계를 매핑한다.
	// FetchType.LAZY : 지연 로딩 전략 사용. ( getAddress() )
	@OneToOne(fetch = FetchType.LAZY)
	
	// @JoinColumn : 외래 키(fk)를 설정하는 어노테이션.
	// address_id라는 이름의 외래 키 컬럼이 User 테이블에 추가된다.
	@JoinColumn(name = "address_id")
	private Address address;
}
