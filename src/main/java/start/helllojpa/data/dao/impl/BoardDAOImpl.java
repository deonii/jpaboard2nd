package start.helllojpa.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import start.helllojpa.data.dao.BoardDAO;
import start.helllojpa.data.dto.BoardResponseDTO;
import start.helllojpa.data.entity.Board;
import start.helllojpa.data.repository.BoardRepository;

import java.util.List;

@Service
@Transactional
public class BoardDAOImpl implements BoardDAO {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public Board saveBoard(Board board) {
        Board saveBoard = boardRepository.save(board);
        return saveBoard;
    }

    @Override
    public Board getBoard(Long boardId) {
        Board boardEntity = boardRepository.getById(boardId);
        return boardEntity;
    }

    @Override
    public Page<Board> getListBoard(Pageable pageable) {
        Page<Board> boardList = boardRepository.findAll(pageable);
        return boardList;
    }
}
