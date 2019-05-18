package tim.app.test.taboolaWidg.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TabooCardNotFoundAdvice {

    /*  For Error handling When unit not found in DB  */

    @ResponseBody
    @ExceptionHandler(TabooCardNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String TabooCardNotFoundHandler(TabooCardNotFoundException ex) {
        return ex.getMessage();
    }
}
