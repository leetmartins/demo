package com.apirest.demo.services;

import com.apirest.demo.document.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {
	
	Flux <Playlist> findAll();
	Mono <Playlist> findById(String id);
	Mono<Playlist> save(Playlist playlist);
}
