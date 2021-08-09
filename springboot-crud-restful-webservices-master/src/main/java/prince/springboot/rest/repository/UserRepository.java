package prince.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prince.springboot.rest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
