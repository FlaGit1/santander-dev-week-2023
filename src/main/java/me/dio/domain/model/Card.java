package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity(name = "tb_card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "available_limit", precision = 13, scale = 2)
	private BigDecimal Limit;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public BigDecimal getLimit() {
		return Limit;
	}
	public void setLimit(BigDecimal limit) {
		Limit = limit;
	}
	
	

}
