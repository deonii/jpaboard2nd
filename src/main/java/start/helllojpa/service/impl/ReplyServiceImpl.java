package start.helllojpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import start.helllojpa.data.dao.ReplyDAO;
import start.helllojpa.data.dto.ReplyResponseDTO;
import start.helllojpa.data.entity.Reply;
import start.helllojpa.service.ReplyService;


@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    ReplyDAO replyDAO;

    @Override
    public ReplyResponseDTO saveReply(String userName, String password, String content, Long boardId) {
        Reply reply = new Reply(userName, password, content, boardId);

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
    }
}
