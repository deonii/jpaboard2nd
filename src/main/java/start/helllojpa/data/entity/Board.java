package start.helllojpa.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties({"replies"})
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
    @CreatedDate
    private LocalDateTime createAt;

    @JsonManagedReference
    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Reply> replies = new ArrayList<>();

    public Board() {
    }

    @Builder
    public Board(String userName, String password, String title, String content) {
        this.userName = userName;
        this.password = password;
        this.title = title;
        this.content = content;
    }
}
