package start.helllojpa.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import start.helllojpa.data.dao.ReplyDAO;
import start.helllojpa.data.entity.Reply;
import start.helllojpa.data.repository.ReplyRepository;

@Service
@Transactional
public class ReplyDAOImpl implements ReplyDAO {

    @Autowired
    ReplyRepository replyRepository;

    @Override
    public Reply saveReply(Reply reply) {
        Reply saveReply = replyRepository.save(reply);
        return saveReply;
    }
}
