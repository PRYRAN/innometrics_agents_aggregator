package innometrics.agents.aggregator.agents.gitlab.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commit {


    private String commitId;
    private Long projectId;
    private String authorName;
    private String committedDate;
    private String createdAt;
    private String title;
    private String message;

}
