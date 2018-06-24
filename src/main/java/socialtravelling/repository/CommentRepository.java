package socialtravelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialtravelling.models.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer> {
}
