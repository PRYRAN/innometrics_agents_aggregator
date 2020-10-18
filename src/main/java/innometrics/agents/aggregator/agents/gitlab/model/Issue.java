package innometrics.agents.aggregator.agents.gitlab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Issue {


    private Long issueId;

    private Long projectId;

    private String description;
    private String state;
    private String title;
    private String updatedAt;
    private String createdAt;
    private String closedAt;


}
