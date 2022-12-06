package co.com.ceiba.jobsearch.api;

import co.com.ceiba.jobsearch.JobPosition;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: Application/json")
public interface APIJobs {

    @RequestLine("GET /positions.json")
    List<JobPosition> getJobs(@QueryMap Map<String, Object> queryMap);
}
