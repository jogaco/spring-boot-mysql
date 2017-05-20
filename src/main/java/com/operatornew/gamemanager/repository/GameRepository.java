/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operatornew.gamemanager.repository;

import java.util.List;

import com.operatornew.gamemanager.domain.Game;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "game", path = "games")

public interface GameRepository extends PagingAndSortingRepository<Game, Integer> {
    List<Game> findByName(@Param("name") String name);
}