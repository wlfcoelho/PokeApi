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
public class DiamondPearl {
	public String back_default;
    public Object back_female;
    public String back_shiny;
    public Object back_shiny_female;
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}
