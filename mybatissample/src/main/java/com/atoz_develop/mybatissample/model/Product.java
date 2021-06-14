package com.atoz_develop.mybatissample.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
	
	private Long prodId;
	
	@NonNull 
	private String prodName;
	
	@NonNull 
	private int prodPrice;
}
