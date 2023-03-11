package start.helllojpa.data.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReplyRequestDTO {

    @NotNull
    @JsonProperty("user_name")
    private String userName;

    @NotNull
    private String password;

    @NotNull
    private String content;
}
