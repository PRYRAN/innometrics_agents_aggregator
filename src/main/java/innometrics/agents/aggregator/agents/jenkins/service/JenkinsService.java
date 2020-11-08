package innometrics.agents.aggregator.agents.jenkins.service;

import innometrics.agents.aggregator.agents.jenkins.feign.JenkinsFeignClient;
import innometrics.agents.aggregator.agents.jenkins.model.JobDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JenkinsService {

    @Autowired
    JenkinsFeignClient jenkinsFeignClient;

    public List<JobDTO> getJobs(){
        return jenkinsFeignClient.getJobs();
    }
}
