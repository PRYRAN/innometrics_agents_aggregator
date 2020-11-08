package innometrics.agents.aggregator.agents.jenkins.controller;


import innometrics.agents.aggregator.agents.gitlab.feign.GitlabFeignClient;
import innometrics.agents.aggregator.agents.gitlab.model.Commit;
import innometrics.agents.aggregator.agents.jenkins.model.JobDTO;
import innometrics.agents.aggregator.agents.jenkins.service.JenkinsService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "agents/jenkins")
@RestController
//@CrossOrigin(origins = "/**")
public class JenkinsController {

    @Autowired
    JenkinsService jenkinsService;

    @GetMapping
    List<JobDTO> getJobs(){
        return jenkinsService.getJobs();
    }
}
