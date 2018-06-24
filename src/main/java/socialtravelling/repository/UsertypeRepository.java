package socialtravelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialtravelling.models.Usertypes;


public interface UsertypeRepository extends JpaRepository<Usertypes, Integer> {
}
