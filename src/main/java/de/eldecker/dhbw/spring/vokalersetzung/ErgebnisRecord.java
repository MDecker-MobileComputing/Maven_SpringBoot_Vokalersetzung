package de.eldecker.dhbw.spring.vokalersetzung;


/**
 * Ergebnistyp für REST-Endpunkt.
 * 
 * @param inputText An REST-Endpunkt übergebener String
 * 
 * @param zielVokal Vokal, auf den alle Vokale in {@code inputText}
 *                  abgebildet werden sollen
 *                  
 * @param outputText Text nach Ersetzung aller Vokale in {@code inputText} 
 *                   mit {@code zielVokal}
 */
public record ErgebnisRecord( String inputText,
                              char   zielVokal, 
                              String outputText ) {
}
