package mk.iwce.java_task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drivers {
    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean active;
}
