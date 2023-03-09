package start.helllojpa.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import start.helllojpa.data.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
