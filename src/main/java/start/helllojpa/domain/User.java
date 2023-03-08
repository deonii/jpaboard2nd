package start.helllojpa.domain;


import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="user")
@Getter
public class User {

    @Id
    private String email;
    private String name;
    @Column(name = "create_date")
    private LocalDateTime createDate;

    protected User() {
    }

    public User(String email, String name, LocalDateTime createDate) {
        this.email = email;
        this.name = name;
        this.createDate = createDate;
    }
}
