package start.helllojpa.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import start.helllojpa.data.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
