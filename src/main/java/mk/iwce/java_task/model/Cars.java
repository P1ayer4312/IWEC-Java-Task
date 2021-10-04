package mk.iwce.java_task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cars {
    private Integer id;
    private String manufacturer;
    private String model;
}
