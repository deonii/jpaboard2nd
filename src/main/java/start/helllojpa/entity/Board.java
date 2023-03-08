package start.helllojpa.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    private String userName;
    private String password;

    private String title;
    private String content;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Reply> replies = new ArrayList<>();

    public Board() {
    }
}
