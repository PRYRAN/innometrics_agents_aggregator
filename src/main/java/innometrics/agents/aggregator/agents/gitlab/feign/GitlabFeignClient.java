package innometrics.agents.aggregator.agents.gitlab.feign;

import innometrics.agents.aggregator.agents.gitlab.model.Commit;
import innometrics.agents.aggregator.agents.gitlab.model.Event;
import innometrics.agents.aggregator.agents.gitlab.model.Issue;
import innometrics.agents.aggregator.agents.gitlab.model.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@FeignClient(
        value = "agents-gitlab",
        url = "${agents.gitlab}"
)
public interface GitlabFeignClient {


    @GetMapping("/projects/{projectId}")
    public Project getProjectById(@PathVariable Long projectId);



    @GetMapping("/projects/{projectId}/events")
    public List<Event> getProjectEvents(@PathVariable Long projectId);



    @GetMapping("/projects/{projectId}/commits")
    public List<Commit> getProjectCommits(@PathVariable Long projectId);


    @GetMapping("/projects/{projectId}/issues")
    public List<Issue> getProjectIssues(@PathVariable Long projectId);


    @PostMapping("projects")
    public void fetchProject(@RequestParam(name = "auth_token") String authToken, @RequestParam(name = "repo_name", required = false) String repoName);


    @GetMapping("/projects")
    public List<Project> getProjects(@RequestParam(name = "auth_token") String authToken, @RequestParam(name = "fetched") Boolean fetched) throws IOException;
}
