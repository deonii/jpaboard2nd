package start.helllojpa.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardListRequestDTO {


    @Min(value = 1)
    private Integer page = 1;

    @Min(value = 1)
    @Max(value = 100)
    private Integer offset = 5;

}
