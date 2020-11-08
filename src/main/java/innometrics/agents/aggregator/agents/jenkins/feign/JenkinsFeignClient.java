package innometrics.agents.aggregator.agents.jenkins.feign;

import innometrics.agents.aggregator.agents.gitlab.model.Commit;
import innometrics.agents.aggregator.agents.gitlab.model.Event;
import innometrics.agents.aggregator.agents.gitlab.model.Issue;
import innometrics.agents.aggregator.agents.gitlab.model.Project;
import innometrics.agents.aggregator.agents.jenkins.model.JobDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@FeignClient(
        value = "agents-jenkins",
        url = "${agents.jenkins}"
)
public interface JenkinsFeignClient {


    @GetMapping
    public List<JobDTO> getJobs();

}
