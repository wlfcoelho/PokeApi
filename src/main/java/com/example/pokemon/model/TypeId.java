package com.example.pokemon.model;

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
public class TypeId {
	public DamageRelations damage_relations;
    public List<GameIndices> game_indices;
    public Generation generation;
    public int id;
    public MoveDamageClass move_damage_class;
    public List<Move> moves;
    public String name;
    public List<Name> names;
    public List<Object> past_damage_relations;
    public List<Pokemon> pokemon;
}
