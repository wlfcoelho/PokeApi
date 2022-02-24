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
public class DamageRelations {
	public List<DoubleDamageFrom> double_damage_from;
    public List<DoubleDamageTo> double_damage_to;
    public List<HalfDamageFrom> half_damage_from;
    public List<HalfDamageTo> half_damage_to;
    public List<NoDamageFrom> no_damage_from;
    public List<Object> no_damage_to;
}
