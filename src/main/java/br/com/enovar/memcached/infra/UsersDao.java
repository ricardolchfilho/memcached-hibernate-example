package br.com.enovar.memcached.infra;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.enovar.memcached.domain.User;
import br.com.enovar.memcached.domain.UsersRepository;

@Component
public class UsersDao implements UsersRepository {

	private final EntityManager manager;
	
	public UsersDao(EntityManager manager) throws IOException {
		this.manager = manager;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		List<User> users = manager.createQuery("select u from User u")
							.getResultList();
		
		return users;
	}

}
