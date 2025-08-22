package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.SongTitleUI.LBL_NAME_SONG;

public class ValidateSong implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_NAME_SONG, isVisible()).forNoMoreThan(10).seconds()
        );

        String title = LBL_NAME_SONG.resolveFor(actor).getText();
        String titleSong = actor.recall("song");

        return titleSong.equals(title);
    }

    public static Question<Boolean> assertion() {
        return new ValidateSong();
    }
}

