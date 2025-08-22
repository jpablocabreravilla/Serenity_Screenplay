package ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchUI {

    public static Target SEARCH_INPUT = Target.the("Search input")
            .locatedBy("//*[@id='center']//form/input");

}
