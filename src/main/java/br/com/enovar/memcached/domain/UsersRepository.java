package br.com.enovar.memcached.domain;

import java.util.List;

public interface UsersRepository {

	List<User> findAll();

}
