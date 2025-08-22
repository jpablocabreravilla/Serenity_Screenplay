package tasks;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenYoutubeTask implements Task {

    private static final EnvironmentVariables environmentVariables =
            SystemEnvironmentVariables.createEnvironmentVariables();

    @Override
    public <T extends Actor> void performAs(T actor) {
        String urlWeb = EnvironmentSpecificConfiguration
                .from(environmentVariables)
                .getProperty("webdriver.base.url");

        actor.attemptsTo(
                Open.url(urlWeb)
        );
    }

    public static OpenYoutubeTask openBrowser() {
        return instrumented(OpenYoutubeTask.class);
    }
}
