package de.eldecker.dhbw.spring.vokalersetzung;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * Unit-Tests für Methode {@link Vokalersetzer#vokaleErsetzen(String, char)}.
 */
@SpringBootTest
class VokalersetzungApplicationTests {


    /** Objekt mit Methode unter Test. */
    @Autowired
    Vokalersetzer _cut;
    
    
    @ParameterizedTest
    @CsvSource({ "Leberwurst,a,Labarwarst",                 
                 "LEBERWURST,a,LABARWARST",
                 "Leberwurst,A,Labarwarst",
                 "LEBERWURST,A,LABARWARST" })               
    void happyPath( String input, char vokal, String ergebnisErwartet ) {
        
        final String ergebnisTatsaechlich = _cut.vokaleErsetzen( input, vokal );
        assertEquals( ergebnisErwartet, ergebnisTatsaechlich );
    }

    
    @Test
    void inputOhneVokal() {

        final String stringOhneVokal = "grmpl";
        
        final String ergebnisTatsaechlich = _cut.vokaleErsetzen( stringOhneVokal, 'a' );
        assertEquals( stringOhneVokal, ergebnisTatsaechlich );        
    }
    
    
    @Test
    void leererInput() {
        
        final String ergebnisTatsaechlich1 = _cut.vokaleErsetzen( "", 'a' );
        assertEquals( "", ergebnisTatsaechlich1 );
        
        final String ergebnisTatsaechlich2 = _cut.vokaleErsetzen( " ", 'a' );
        assertEquals( " ", ergebnisTatsaechlich2 );        
    }
    
}
