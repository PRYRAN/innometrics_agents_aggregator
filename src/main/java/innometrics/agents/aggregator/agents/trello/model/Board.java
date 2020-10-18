package innometrics.agents.aggregator.agents.trello.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    private String boardId;
    private String token;
    private String key;
    private String name;
    private String boardUrl;



}
