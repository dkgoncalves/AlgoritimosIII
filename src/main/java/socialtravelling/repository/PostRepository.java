package socialtravelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialtravelling.models.Posts;

public interface PostRepository extends JpaRepository<Posts, Integer> {
}
