package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.SongListUI.LIST_SONGS;

public class SelectRandomSong implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listSong = LIST_SONGS.resolveAllFor(actor);
        Random random = new Random();
        int index = random.nextInt(listSong.size());

        WebElementFacade song = listSong.get(index);
        String nameSong = String.valueOf(song.getText());

        actor.remember("song", nameSong);
        song.click();
    }

    public static SelectRandomSong random() {
        return instrumented(SelectRandomSong.class);
    }
}
