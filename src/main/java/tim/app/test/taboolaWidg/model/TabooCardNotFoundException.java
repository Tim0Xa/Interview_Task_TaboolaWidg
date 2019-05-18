package tim.app.test.taboolaWidg.model;

public class TabooCardNotFoundException extends RuntimeException {

    /*  For Error handling When unit not found in DB  */

    public TabooCardNotFoundException(Long id) {
        super("Could not find Card " + id);
    }
}
