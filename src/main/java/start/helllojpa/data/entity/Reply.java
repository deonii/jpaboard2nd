package start.helllojpa.data.entity;


import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
public class Reply {

    @Id
    @GeneratedValue
    @Column(name = "reply_id")
    private Long id;

    private String userName;
    private String password;

    private String content;

    @Column(name = "create_at")
    @CreatedDate
    private LocalDateTime createAt;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public Reply() {}

    @Builder
    public Reply(String userName, String password, String content, Long boardId) {
        this.userName = userName;
        this.password = password;
        this.content = content;
//        this.board = boardId;
    }
}
