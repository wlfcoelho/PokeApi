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
public class GenerationIV {
	@JsonProperty("diamond-pearl") 
    public DiamondPearl diamondPearl;
    @JsonProperty("heartgold-soulsilver") 
    public HeartgoldSoulsilver heartgoldSoulsilver;
    public Platinum platinum;
}
