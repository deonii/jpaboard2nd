package start.helllojpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import start.helllojpa.data.dto.BoardListRequestDTO;
import start.helllojpa.data.dto.BoardRequestDTO;
import start.helllojpa.data.dto.BoardResponseDTO;
import start.helllojpa.data.entity.Board;
import start.helllojpa.service.BoardService;

import javax.validation.Valid;
import javax.xml.xpath.XPath;
import java.util.List;

@Controller
@ResponseBody
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/board")
    public BoardResponseDTO createBoard(@RequestBody BoardRequestDTO boardRequestDTO) {
        String userName = boardRequestDTO.getUserName();
        String password = boardRequestDTO.getPassword();
        String title = boardRequestDTO.getTitle();
        String content = boardRequestDTO.getContent();
        BoardResponseDTO boardResponseDTO = boardService.saveBoard(userName, password, title, content);

        return boardResponseDTO;
    }

    @GetMapping("/boards")
    public List<BoardResponseDTO> listBoard(
            @Valid BoardListRequestDTO boardListRequestDTO
    ) {
        Pageable pageable = PageRequest.of(
                boardListRequestDTO.getPage() - 1,
                boardListRequestDTO.getOffset()
        );
        List<BoardResponseDTO> listBoard = boardService.getListBoard(pageable);
        return listBoard;
    }

}
