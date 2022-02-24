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
public class Crystal {
	private String back_default;
	private String back_shiny;
	private String back_shiny_transparent;
	private String back_transparent;
	private String front_default;
	private String front_shiny;
	private String front_shiny_transparent;
	private String front_transparent;
}