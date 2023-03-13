package start.helllojpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import start.helllojpa.data.dao.BoardDAO;
import start.helllojpa.data.dao.ReplyDAO;
import start.helllojpa.data.dto.ReplyResponseDTO;
import start.helllojpa.data.entity.Board;
import start.helllojpa.data.entity.Reply;
import start.helllojpa.service.ReplyService;


@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    ReplyDAO replyDAO;

    @Autowired
    BoardDAO boardDAO;

    @Override
    public ReplyResponseDTO saveReply(String userName, String password, String content, Long boardId) {
        try {
            Board board = boardDAO.getBoard(boardId);
            Reply reply = new Reply(userName, password, content, board);
            Reply saveReply = replyDAO.saveReply(reply);
            ReplyResponseDTO replyResponseDTO = ReplyResponseDTO.builder()
                    .id(saveReply.getId())
                    .userName(saveReply.getUserName())
                    .password(saveReply.getPassword())
                    .content(saveReply.getContent())
                    .createAt(saveReply.getCreateAt())
                    .boardId(saveReply.getBoard().getId())
                    .build();
            return replyResponseDTO;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Board Not Found");
        }
    }
}
