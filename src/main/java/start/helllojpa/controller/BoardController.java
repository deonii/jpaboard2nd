package start.helllojpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import start.helllojpa.data.dto.BoardRequestDTO;
import start.helllojpa.data.dto.BoardResponseDTO;
import start.helllojpa.data.entity.Board;
import start.helllojpa.service.BoardService;

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

}
