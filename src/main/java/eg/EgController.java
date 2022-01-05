package eg;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@RestController
public class EgController {

//    Logger log = LoggerFactory.getLogger(EgController.class);
    org.apache.logging.log4j.Logger log2 = LogManager.getLogger(EgController.class);
//
//    private static final Logger logger = LogManager.getLogger();

    @PostMapping(consumes = MediaType.TEXT_PLAIN_VALUE)
    public void dummyLogger(@RequestBody String theLogMessage){
//        log.warn("Logging " + theLogMessage);
        log2.warn("Logging II" + theLogMessage);
    }
}
