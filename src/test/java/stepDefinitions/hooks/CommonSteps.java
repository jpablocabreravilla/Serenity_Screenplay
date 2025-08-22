package stepDefinitions.hooks;

import io.cucumber.java.en.Given;
import tasks.OpenYoutubeTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonSteps{

    @Given("el usuario abre la url de youtube")
    public void elUsuarioAbreLaUrlDeYoutube() {
        theActorCalled("User").wasAbleTo(OpenYoutubeTask.openBrowser());
    }
}
