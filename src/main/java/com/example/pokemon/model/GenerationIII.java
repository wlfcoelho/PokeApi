package com.example.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class GenerationIII {
	public Emerald emerald;
    @JsonProperty("firered-leafgreen") 
    public FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire") 
    public RubySapphire rubySapphire;
}
