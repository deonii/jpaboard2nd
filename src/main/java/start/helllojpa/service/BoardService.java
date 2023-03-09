package start.helllojpa.service;

import start.helllojpa.data.dto.BoardResponseDTO;
import start.helllojpa.data.entity.Board;

public interface BoardService {

    BoardResponseDTO saveBoard(String userName, String password, String title, String content);

    BoardResponseDTO getBoard(Long id);
}
