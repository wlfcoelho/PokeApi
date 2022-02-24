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
public class Sprites {
	private String back_default;
	private String back_female;
	private String back_shiny;
	private String back_shiny_female;
	private String front_default;
	private String front_female;
	private String front_shiny;
	private String front_shiny_female;
	private Other other;
	private Versions versions;
	
}
