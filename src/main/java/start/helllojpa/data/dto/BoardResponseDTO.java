package start.helllojpa.data.dto;


import com.sun.istack.NotNull;
import lombok.*;
import start.helllojpa.data.entity.Reply;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardResponseDTO {

    @NotNull
    private Long id;
    @NotNull
    private String userName;
    @NotNull
    private String password;

    @NotNull
    private String title;
    @NotNull
    private String content;

    private LocalDateTime createAt;

    private List<Reply> replies;
}
