package com.capitalone.dashboard.collector;

import com.capitalone.dashboard.model.CodeQuality;
import com.capitalone.dashboard.model.SonarProject;

import java.util.List;

public interface SonarClient {

    List<SonarProject> getProjects(String instanceUrl);
//tapas mondal
    CodeQuality currentCodeQuality(SonarProject project);

}
