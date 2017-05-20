/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operatornew.gamemanager.repository;

import java.util.List;

import com.operatornew.gamemanager.domain.Game;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GameRepository extends PagingAndSortingRepository<Game, Integer> {
    
    List<Game> findByName(String name);
    
}