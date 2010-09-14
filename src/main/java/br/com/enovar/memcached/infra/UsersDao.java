package br.com.enovar.memcached.infra;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;

import javax.persistence.EntityManager;

import net.spy.memcached.MemcachedClient;
import br.com.caelum.vraptor.ioc.Component;
import br.com.enovar.memcached.domain.User;
import br.com.enovar.memcached.domain.UsersRepository;

@Component
public class UsersDao implements UsersRepository {

	private final EntityManager manager;
	
	//private final MemcachedClient memcachedClient;

	public UsersDao(EntityManager manager) throws IOException {
		this.manager = manager;
		//this.memcachedClient = new MemcachedClient(new InetSocketAddress("localhost", 18000));
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		List<User> users = manager.createQuery("select u from User u")
							.getResultList();
		
		return users;
	}

}
