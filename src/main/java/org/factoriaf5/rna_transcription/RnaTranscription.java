package org.factoriaf5.rna_transcription;

public class RnaTranscription {
    
    String transcribe(String dnaStrand) {

        /* Y se crea un StringBuilder que es con el que se va a concadenar las cosas que se añaden */
        StringBuilder rnaStrand = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {

            /* se crea un dato de tipo char para que sea con el que se pueda identificar cada
            letra del string y se le asigna un indice para que sea con el que se identifique
            en cada vuelta del ciclo for */
            
            char x = dnaStrand.charAt(i);
            switch (x) {
                case 'G':
                    rnaStrand.append('C');
                    break;
                case 'C':
                    rnaStrand.append('G');
                    break;
                case 'T':
                    rnaStrand.append('A');
                    break;
                case 'A':
                    rnaStrand.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Not reconizegd DNA character: " + x);
            }
        }
        return rnaStrand.toString();
    }

}
