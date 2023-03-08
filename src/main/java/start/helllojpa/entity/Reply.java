package start.helllojpa.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reply {

    @Id
    @GeneratedValue
    @Column(name = "reply_id")
    private Long id;

    private String userName;
    private String password;

    private String content;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public Reply() {}
}
