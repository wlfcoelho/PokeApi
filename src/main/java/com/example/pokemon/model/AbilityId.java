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
public class AbilityId {
	public List<Object> effect_changes;
    public List<EffectEntry> effect_entries;
    public List<FlavorTextEntry> flavor_text_entries;
    public Generation generation;
    public int id;
    public boolean is_main_series;
    public String name;
    public List<Name> names;
    public List<Pokemon> pokemon;
}
