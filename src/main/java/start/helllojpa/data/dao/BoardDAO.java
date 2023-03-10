package start.helllojpa.data.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import start.helllojpa.data.entity.Board;

import java.util.List;

public interface BoardDAO {

    Board saveBoard(Board board);

    Board getBoard(Long boardId);

    Page<Board> getListBoard(Pageable pageable);
}
