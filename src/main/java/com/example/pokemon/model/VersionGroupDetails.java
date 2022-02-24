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
public class VersionGroupDetails {
	private Integer level_learned_at;
	private MoveLearnMethod move_learn_method;
	private VersionGroup version_group;
}
