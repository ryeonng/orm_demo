package com.tenco.bank.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String content;
	
	// mappedBy : post - 연관 관계의 주인이 Comment 엔티티에 post(속성) 필드 임을 나타낸다.
	// 객체 필드 기준으로 생각해야 한다.
	
	// CascadeType.ALL : 제약 설정 시, Post 엔티티에 대한 모든 상태변경(저장, 삭제 등)이 
	// 관련된 Comment 엔티티에 전파되게 된다. (전파 속성)
	@OneToMany(mappedBy = "post" , cascade = CascadeType.ALL) // 엔티티 명 적기(컬럼명x)
	private List<Comment> comments;
}
