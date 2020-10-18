package innometrics.agents.aggregator.agents.gitlab.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    private Long projectId;

    private String name;

    private String path;

    private String token;



}
