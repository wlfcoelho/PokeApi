package com.example.pokemon.service;

import com.example.pokemon.model.AbilityId;
import com.example.pokemon.model.Pokemon;
import com.example.pokemon.model.PokemonList;
import com.example.pokemon.model.TypeId;

import reactor.core.publisher.Mono;

public interface IPokemonService {

	Mono<Pokemon> findById(Integer id);

	Mono<Pokemon> findByName(String name);

	Mono<AbilityId> findByAbilityId(Integer id);

	Mono<PokemonList> findByListPokemon(Integer limit, Integer offset);

	Mono<TypeId> findByTypeId(Integer id);

}
