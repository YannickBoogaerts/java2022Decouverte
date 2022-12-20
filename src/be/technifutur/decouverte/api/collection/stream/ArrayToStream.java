package be.technifutur.decouverte.api.collection.stream;

import be.technifutur.decouverte.api.collection.data.Personne;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

    public static void main(String[] args) {
        Personne[] personnes = Personne.dataTest();

        Stream<Personne> objectif = Arrays.stream(personnes);
        objectif = Arrays.asList(personnes).stream();
    }
}
