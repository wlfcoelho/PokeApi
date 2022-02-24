package com.example.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.pokemon.model.AbilityId;
import com.example.pokemon.model.Pokemon;
import com.example.pokemon.model.PokemonList;
import com.example.pokemon.model.TypeId;

import reactor.core.publisher.Mono;

@Service
public class PokemonService implements IPokemonService {

	@Autowired
	WebClient webClient;

	@Override
	public Mono<Pokemon> findById(Integer id) {

		return webClient.get().uri("/pokemon/" + id).retrieve().bodyToMono(Pokemon.class);
	}

	@Override
	public Mono<Pokemon> findByName(String name) {

		return webClient.get().uri("/pokemon/" + name).retrieve().bodyToMono(Pokemon.class);
	}

	@Override
	public Mono<TypeId> findByTypeId(Integer id) {

		return webClient.get().uri("/type/" + id).retrieve().bodyToMono(TypeId.class);
	}

	@Override
	public Mono<AbilityId> findByAbilityId(Integer id) {

		return webClient.get().uri("/ability/" + id).retrieve().bodyToMono(AbilityId.class);
	}

	@Override
	public Mono<PokemonList> findByListPokemon(Integer limit, Integer offset) {

		return webClient.get().uri("/pokemon?limit=" + limit + "offset=" + offset).retrieve().bodyToMono(PokemonList.class);
	}
}
