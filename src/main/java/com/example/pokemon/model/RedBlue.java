package com.example.pokemon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class RedBlue {
	private String back_default;
	private String back_gray;
	private String back_transparent;
	private String front_default;
	private String front_gray;
	private String front_transparent;
	
}
