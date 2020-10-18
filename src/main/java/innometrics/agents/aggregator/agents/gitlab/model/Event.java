package innometrics.agents.aggregator.agents.gitlab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private Long eventId;
    private String actionName;
    private String targetId;
    private String targetType;
    private String authorId;
    private String targetTitle;
    private String createdAt;

}
