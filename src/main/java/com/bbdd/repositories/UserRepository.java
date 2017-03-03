/**
 * 
 */
package com.bbdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbdd.model.User;

/**
 * @author jguerra
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
}
