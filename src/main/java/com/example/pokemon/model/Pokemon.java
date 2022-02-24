package com.example.pokemon.model;

import java.io.Serializable;
import java.util.List;

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
public class Pokemon implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Abilities> abilities;

	private Integer base_experience;
	private List<Forms> forms;
	private List<GameIndices> game_indices;
	private Integer height;
	private List<HeldItems> held_items;
	private Integer id;
	private Boolean is_default;
	private String location_area_encounters;
	private List<Moves> moves;
	private String name;
	private Integer order;
	private List<PastTypes> past_types;
	private Species species;
	private Sprites sprites;
	public List<Stat> stats;
	public List<Type> types;
	public int weight;
	
}
