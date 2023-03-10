package start.helllojpa.service;

import org.springframework.data.domain.Pageable;
import start.helllojpa.data.dto.BoardResponseDTO;
import start.helllojpa.data.entity.Board;

import java.util.List;

public interface BoardService {

    BoardResponseDTO saveBoard(String userName, String password, String title, String content);

    BoardResponseDTO getBoard(Long id);

    List<BoardResponseDTO> getListBoard(Pageable pageable);
}
