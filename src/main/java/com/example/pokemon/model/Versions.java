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
public class Versions {
	@JsonProperty("generation-i") 
    public GenerationI generationI;
    @JsonProperty("generation-ii") 
    public GenerationII generationIi;
    @JsonProperty("generation-iii") 
    public GenerationIII generationIii;
    @JsonProperty("generation-iv") 
    public GenerationIV generationIv;
    @JsonProperty("generation-v") 
    public GenerationV generationV;
    @JsonProperty("generation-vi") 
    public GenerationVI generationVi;
    @JsonProperty("generation-vii") 
    public GenerationVII generationVii;
    @JsonProperty("generation-viii") 
    public GenerationVII generationViii;
}
