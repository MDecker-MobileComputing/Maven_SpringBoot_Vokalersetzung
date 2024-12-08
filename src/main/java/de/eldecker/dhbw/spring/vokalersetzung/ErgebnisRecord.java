package de.eldecker.dhbw.spring.vokalersetzung;


public record ErgebnisRecord( String inputText,
                              char zielvorkal, 
                              String outputText ) {
}
