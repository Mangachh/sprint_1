package tasca8.nivell2.Exercici1;

import java.util.Arrays;
import java.util.List;

public class ListOperations {


    public void doListOperations() {
        List<String> list = Arrays.asList("atalea", "pimiento", "cascada", "15", "saco", "58", "chorizo", "bisonte",
                "pan", "245", "22");
        sortedByLength(list);
        emptyLine();
        reverseSortedLength(list);
        emptyLine();
        sortedAlphabet(list);
        emptyLine();
        sortedEthenElse(list);
        emptyLine();
        modifyETo4(list);
        emptyLine();
        showOnlyNumbers(list);
    }

    private void emptyLine() {
        System.out.println();
    }

    private void sortedByLength(final List<String> list) {
        System.out.println("Ordenando lista por longitud:");
        List<String> output = list.stream().sorted((a, b) -> a.length() - b.length()).toList();
        System.out.println(output);
    }

    private void reverseSortedLength(final List<String> list) {
        System.out.println("Ordenando lista por longitud inversa:");
        List<String> output = list.stream().sorted((a, b) -> b.length() - a.length()).toList();
        System.out.println(output);
    }

    private void sortedAlphabet(final List<String> list) {
        System.out.println("Ordenando alfabeticamente:");
        List<String> output = list.stream().filter(s -> Character.isDigit(s.charAt(0)) == false)
                .sorted((a, b) -> a.charAt(0) - b.charAt(0)).toList();
        System.out.println(output);
    }

    private void sortedEthenElse(final List<String> list) {
        System.out.println("Primero las que contienen e, luego lo demás:");
        List<String> output = list.stream().sorted((a, b) -> {
            int valA = a.contains("e") ? 1 : 0;
            int valB = b.contains("e") ? 1 : 0;
            return valB - valA;
        }).toList();
        System.out.println(output);
    }

    private void modifyETo4(final List<String> list) {
        System.out.println("Cambiando el caracter e por un 4:");
        List<String> output = list.stream().map(s -> s.replace("e", "4")).toList();
        System.out.println(output);
    }

    private void showOnlyNumbers(final List<String> list) {
        System.out.println("Mostrando sólo los numeros:");
        List<String> output = list.stream().filter(s -> s.chars().allMatch(Character::isDigit)).toList();
        System.out.println(output);
    }
    
}
