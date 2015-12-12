package com.repository;

import com.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Janusz on 2015-12-12.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {



}
