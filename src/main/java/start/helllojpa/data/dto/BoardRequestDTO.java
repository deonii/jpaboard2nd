package start.helllojpa.data.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("user_name")
    private String userName;
    @NotNull
    private String password;

    @NotNull
    private String title;
    @NotNull
    private String content;

}
