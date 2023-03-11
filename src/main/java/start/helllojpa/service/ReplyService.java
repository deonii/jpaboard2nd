package start.helllojpa.service;

import start.helllojpa.data.dto.ReplyRequestDTO;
import start.helllojpa.data.dto.ReplyResponseDTO;

public interface ReplyService {
    ReplyResponseDTO saveReply(String userName, String password, String content, Long boardId);
}
