package innometrics.agents.aggregator.agents.trello.feign;

import innometrics.agents.aggregator.agents.trello.model.Action;
import innometrics.agents.aggregator.agents.trello.model.Board;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@FeignClient(
        value = "agents-trelo",
        url = "${agents.trello}/api"
)
public interface TrelloFeignClient {

    @PostMapping("/keytoken")

    public List<Board> addToken(@RequestParam String token, @RequestParam String key);


    @PostMapping("/keytoken/boardUrl")

    public Optional<Board> fetchBoard(@RequestParam String token, @RequestParam String key, @RequestParam String boardUrl) throws IOException;


    @GetMapping("/board")

    Optional<Board> getBoard(@RequestParam String token, @RequestParam String key,
                             @RequestParam String boardUrl);


    @GetMapping("/boards/action")

    Optional<Action> getAction(@RequestParam String token, @RequestParam String key,
                               @RequestParam String boardUrl, @RequestParam String actionId);



    @GetMapping("/boards/actions")

    List<Optional<Action>> getActionsByType(@RequestParam String token, @RequestParam String key,
                                            @RequestParam String boardUrl, @RequestParam(required = false) String type,
                                            @RequestParam(required = false) String from, @RequestParam(required = false) String to);


    @PostMapping("/trello/hook")

    void webhook(@RequestBody String request);


    @GetMapping(value = "/trello/hooks")

    public String getWebhooksForToken(@RequestParam String token, @RequestParam String key);

    @RequestMapping(value = "/trello/hook/id", method = {RequestMethod.GET})

    public String getIdOfWebhook(@RequestParam String token, @RequestParam String key, @RequestParam String boardUrl);
    @RequestMapping(value = "/trello/hook", method = {RequestMethod.DELETE})

    public void deleteWebhook (@RequestParam String token, @RequestParam String key, @RequestParam String idWebhook);

    @RequestMapping(value = "/trello/hook/enable", method = {RequestMethod.POST})

    public void setWebhook(@RequestParam String token, @RequestParam String key, @RequestParam String boardUrl);
}
