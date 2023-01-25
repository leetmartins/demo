package com.apirest.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.demo.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{

}
