package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Pokemon;
import com.revature.models.Trainer;
import com.revature.repos.PokemonDAO;
import com.revature.repos.TrainerDAO;

@Service
public class PokeService {
	
	private PokemonDAO pdao;
	private TrainerDAO tdao;
	
	@Autowired
	public PokeService(PokemonDAO pdao, TrainerDAO tdao) {
		super();
		this.pdao = pdao;
		this.tdao = tdao;
	}
	
	
	public List<Trainer> findAllTrainers() {
		return tdao.findAll();
	}

	public Trainer findTrainerById(int id) {
		
		return tdao.findById(id).get();
	}

	public void insertTrainer(Trainer t) {
		tdao.save(t);
	}

	public void insertPokemon(Pokemon p) {
		pdao.save(p);
	}
	

}
