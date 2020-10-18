package innometrics.agents.aggregator.agents.trello.controller;


import innometrics.agents.aggregator.agents.trello.feign.TrelloFeignClient;
import innometrics.agents.aggregator.agents.trello.model.Board;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(
        level = AccessLevel.PRIVATE,
        makeFinal = true
)
@RequestMapping(value = "agents/trello")
@RestController
//@CrossOrigin(origins = "/**")
public class TrelloController {

    TrelloFeignClient trelloFeignClient;

    @GetMapping
    public List<Board> getBoards(@RequestParam String token, @RequestParam String key){

        return trelloFeignClient.addToken(token, key);
    }
}
