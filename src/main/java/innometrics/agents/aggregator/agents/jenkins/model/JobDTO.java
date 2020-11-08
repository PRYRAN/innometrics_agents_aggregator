package innometrics.agents.aggregator.agents.jenkins.model;

import lombok.Data;

@Data
public class JobDTO {

    private String description;
    private String displayName;
    private boolean buildable;
    private Long firstBuild;
    private Long lastBuild;


}
