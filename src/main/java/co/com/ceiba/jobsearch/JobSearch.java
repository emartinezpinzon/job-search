package co.com.ceiba.jobsearch;

import co.com.ceiba.jobsearch.cli.CLIArguments;
import com.beust.jcommander.JCommander;
import static co.com.ceiba.jobsearch.CommanderFunctions.buildCommanderWithName;

public class JobSearch {
    public static void main(String[] args) {
        System.out.println("Welcome to Job Search!!!");
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);
    }
}
