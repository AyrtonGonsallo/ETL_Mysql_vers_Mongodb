package com.test.microservices.web;

import java.util.List;


import org.springframework.web.bind.annotation.*;

import com.test.microservices.entities.Champion;
import com.test.microservices.repositories.ChampionsRepository;


@RestController
public class ChampionsRestController {
	private ChampionsRepository ChampionsR;
	
	public ChampionsRestController(ChampionsRepository cR){
			this.ChampionsR=cR;
			
	}
	@GetMapping(path="/get_All_Champions")
	public List<Champion>listChampionss(){
		return ChampionsR.findAll();
		
	}
	@GetMapping(path="/get_Champions/{id}")
	public Champion getChampions(@PathVariable int id){
		return ChampionsR.findById(id).get();
		
	}
	@PostMapping(path="/add_Champions")
	public Champion saveChampions(@RequestBody Champion Champions){
		
		return ChampionsR.save(Champions);
		
	}
	@PutMapping(path="/update_Champions/{id}")
	public Champion updateChampions(@PathVariable int id,@RequestBody Champion cl){
		cl.setID(id);
		return ChampionsR.save(cl);
		
	}
	@DeleteMapping(path="/delete_Champions/{id}")
	public void deleteChampions(@PathVariable int id){
		ChampionsR.deleteById(id);
		
	}
	
}
