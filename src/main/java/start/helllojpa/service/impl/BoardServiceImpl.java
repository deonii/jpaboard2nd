package start.helllojpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import start.helllojpa.data.dao.BoardDAO;
import start.helllojpa.data.dto.BoardRequestDTO;
import start.helllojpa.data.dto.BoardResponseDTO;
import start.helllojpa.data.entity.Board;
import start.helllojpa.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardDAO boardDAO;

    @Override
    public BoardResponseDTO saveBoard(String userName, String password, String title, String content) {
        Board board = new Board(userName, password, title, content);
        Board saveBoard = boardDAO.saveBoard(board);
        BoardResponseDTO boardResponseDTO = new BoardResponseDTO(
                saveBoard.getId(),
                saveBoard.getUserName(),
                saveBoard.getPassword(),
                saveBoard.getTitle(),
                saveBoard.getContent(),
                saveBoard.getCreateAt(),
                saveBoard.getReplies());

        return boardResponseDTO;
    }

    @Override
    public BoardResponseDTO getBoard(Long id) {

        return null;
    }
}
