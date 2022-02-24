package com.example.pokemon.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.netty.http.client.HttpClient;

@Configuration
@EnableWebFlux
public class PokemonConfig implements WebFluxConfigurer {
	
	Logger logger = LoggerFactory.getLogger(PokemonConfig.class);

	@Bean
	public WebClient getWebClient()
	{
		HttpClient httpClient = HttpClient.create();
		
		
		ClientHttpConnector connector = new ReactorClientHttpConnector(httpClient.wiretap(true));	    

		
		return WebClient.builder()
		        .baseUrl("https://pokeapi.co/api/v2")
		        .clientConnector(connector)
		        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
		        .build();
	}
	
}
