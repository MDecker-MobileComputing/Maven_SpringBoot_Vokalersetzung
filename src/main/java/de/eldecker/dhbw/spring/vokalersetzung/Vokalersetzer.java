package de.eldecker.dhbw.spring.vokalersetzung;

import org.springframework.stereotype.Component;


@Component
public class Vokalersetzer {

    /** Regulärer Ausdruck für Vokale als Großbuchstaben. */
    private final String REGEXP_VOKALE_GROSS = "[AEIOU]";
    
    /** Regulärer Ausdruck für Vokale als Kleinbuchstaben. */
    private final String REGEXP_VOKALE_KLEIN = "[aeiou]";
    

    /**
     * Methode ersetzt {@code inputText} alle Vokale auf {@code zielvokal},
     * vgl. auch das Kinderlied "Drei Chinesen mit dem Kontrabass".  
     * 
     * @param inputText Text, in dem die Vokalersetzung vorgenommen werden soll.
     * 
     * @param zielvokal Vokal, auf den alle Vokale aus {@code aus inputText} abgebildet 
     *                  werden sollen.
     * 
     * @return {@code inputText}, in dem alle Vokale auf {@code zielvokal} abgebildet
     *         wurden.
     */
    public String vokaleErsetzen( String inputText, char zielvokal ) {
        
        final char vokalGross = Character.toUpperCase( zielvokal );
        final char vokalKlein = Character.toLowerCase( zielvokal );
        
        final String ergebnisText = inputText.replaceAll( REGEXP_VOKALE_GROSS, vokalGross + "" )
                                             .replaceAll( REGEXP_VOKALE_KLEIN, vokalKlein + "" );                                         

        return ergebnisText;
    }
    
}
