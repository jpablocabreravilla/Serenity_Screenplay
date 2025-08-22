package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import questions.ValidateSong;
import tasks.SelectSongTask;
import tasks.SearchTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class playSongStepDef {

    @When("el usuario busca una canción y selecciona aleatoriamente una canción")
    public void elUsuarioBuscaUnaCancionYSeleccionaAleatoriamenteUnaCancion() {
        theActorInTheSpotlight().attemptsTo(
                SearchTask.searchSong(),
                SelectSongTask.selectSong()
        );
    }

    @Then("el usuario puede ver el título de la canción")
    public void elUsuarioPuedeVerElTituloDeLaCancion() {
        theActorInTheSpotlight().should(
                seeThat("La respuesta es: ", ValidateSong.assertion(), Matchers.equalTo(true))
        );

    }
}
