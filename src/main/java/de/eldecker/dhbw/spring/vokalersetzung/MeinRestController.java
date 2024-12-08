package de.eldecker.dhbw.spring.vokalersetzung;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vokalersetzung/v1")
public class MeinRestController {

    
    public ResponseEntity<String> vokalErsetzen( String inputText, char zielvokal ) {
        
        return null;
    }
}
