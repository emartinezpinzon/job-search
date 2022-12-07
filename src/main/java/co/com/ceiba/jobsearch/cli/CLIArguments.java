package co.com.ceiba.jobsearch.cli;

import com.beust.jcommander.Parameter;
import lombok.Data;

@Data
public class CLIArguments {
    CLIArguments() {

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD"
    )
    private String keywords;
    @Parameter(
            names = {"--location", "-l"},
            description = "Each search can include an location"
    )
    private String location;
    @Parameter(
            names = {"--page", "-p"},
            description = "API returns 50 results, use a number for the page"
    )
    private Integer page = 0;
    @Parameter(
            names = {"--full-time", "--ft"},
            description = "Add this if do you want search full time works"
    )
    private Boolean isFullTime;
    @Parameter(
            names = {"--markdown", "--md"},
            description = "Get results on markdown"
    )
    private Boolean isMarkdown;
    @Parameter(
            names = {"--help", "-h"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Show help"
    )
    private Boolean isHelp;

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keywords='" + keywords + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }
}
