package start.helllojpa.data.dao;

import start.helllojpa.data.entity.Board;

public interface BoardDAO {

    Board saveBoard(Board board);

    Board getBoard(Long boardId);
}
