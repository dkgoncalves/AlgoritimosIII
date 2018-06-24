package socialtravelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialtravelling.models.Users;
import socialtravelling.models.Usertypes;

public interface UserRepository extends JpaRepository<Users, Integer> {
}