package start.helllojpa.data.dto;


import com.sun.istack.NotNull;
import lombok.*;
import start.helllojpa.data.entity.Reply;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardRequestDTO {

    @NotNull
    private String userName;
    @NotNull
    private String password;

    @NotNull
    private String title;
    @NotNull
    private String content;

    public BoardRequestDTO(String userName, String password, String title, String content) {
        this.userName = userName;
        this.password = password;
        this.title = title;
        this.content = content;
    }
}
