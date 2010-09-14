package br.com.enovar.memcached.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.enovar.memcached.domain.User;
import br.com.enovar.memcached.domain.UsersRepository;

@Resource
public class UsersController {
	
	private final UsersRepository repository;
	
	private final Result result;
	
	public UsersController(UsersRepository repository, Result result) {
		this.repository = repository;
		this.result = result;
	}

	@Get
	@Path("/users")
	public void index() {
		long init = System.currentTimeMillis();
		
		List<User> users = repository.findAll();
		
		long end = System.currentTimeMillis();
		
		long tempo = end - init;
		int quantidade = users.size();
		
		result.include("tempo", tempo).include("quantidade", quantidade).include("quantidadePorTempo", quantidade/tempo);
	}
	
}
