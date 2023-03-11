package start.helllojpa.data.dto;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import start.helllojpa.data.entity.Board;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ReplyResponseDTO {

    @NotNull
    private Long id;

    @NotNull
    private String userName;
    @NotNull
    private String password;

    @NotNull
    private String content;

    @NotNull
    private LocalDateTime createAt;

    @NotNull
    private Long boardId;
}
