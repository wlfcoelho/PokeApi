package com.example.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.pokemon.model.AbilityId;
import com.example.pokemon.model.Pokemon;
import com.example.pokemon.model.PokemonList;
import com.example.pokemon.model.TypeId;
import com.example.pokemon.service.PokemonService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping(value = "/{id}")

	public Mono<Pokemon> findById(@PathVariable("id") Integer id) {
		return pokemonService.findById(id)
				.log()
				.switchIfEmpty(monoReponseStatusNotFoundException());
	}

	@GetMapping(value = "/name/{name}")
	public Mono<Pokemon> findByName(@PathVariable("name") String name) {
		return pokemonService.findByName(name);
	}

	@GetMapping(value = "/type/{id}")
	public Mono<TypeId> findByType(@PathVariable("id") Integer id) {
		return pokemonService.findByTypeId(id);
	}

	@GetMapping(value = "/ability/{id}")
	public Mono<AbilityId> findByAbility(@PathVariable("id") Integer id) {
		return pokemonService.findByAbilityId(id);
	}

	@GetMapping(value = "/lista/{limit}/{offset}")
	public Mono<PokemonList> findByListPokemon(@PathVariable("limit") Integer limit,
			@PathVariable("offset") Integer offset) {
		return pokemonService.findByListPokemon(limit, offset);
	}

	public <T> Mono <T> monoReponseStatusNotFoundException(){
		return Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Pokemon not found"));
	}
}
