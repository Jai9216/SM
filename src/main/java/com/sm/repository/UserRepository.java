package com.sm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sm.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public Optional<User> findByEmail(String email);
	
	public Optional<User> findByUsername(String username);
	
	@Query("SELECT u FROM User u Where u.id IN :users")
	public List<User> findAllUsersByUserIds(@Param("users") List<Integer> userIds );
	
	@Query("SELECT DISTINCT u From USER u Where u.username LIKE %:query% or u.email LIKE %:query%")
	public List<User> findByQuery(@Param("query") String query);

}
