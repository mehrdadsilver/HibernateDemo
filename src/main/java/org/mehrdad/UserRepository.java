package org.mehrdad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select firstName from User")
	public List<String> findWithHQL();
	
	
	//@NativeNamedQuery @ User entity
	public List<User> finaHame();
	
	public User findByFirstName(String fname);
}
