package innometrics.agents.aggregator.agents.gitlab.controller;


import innometrics.agents.aggregator.agents.gitlab.feign.GitlabFeignClient;
import innometrics.agents.aggregator.agents.gitlab.model.Commit;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(
        level = AccessLevel.PRIVATE,
        makeFinal = true
)
@RequestMapping(value = "agents/gitlab")
@RestController
//@CrossOrigin(origins = "/**")
public class GitLabController {

    GitlabFeignClient gitlabFeignClient;

    @GetMapping
    public List<Commit> getCommits(@RequestParam Long projectId){

        return gitlabFeignClient.getProjectCommits(projectId);
    }
}
