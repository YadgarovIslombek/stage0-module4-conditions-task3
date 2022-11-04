package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char a = 'a';
        char o = 'o';
        char i = 'i';
        char e = 'e';

        if(character == a || character == o && character == i && character == e){
            System.out.println("Vowel");
        } else if (character == 'ł') {
            System.out.println("wrong alphabet!");
        } else {
            System.out.println("Consonant");
        }
    }
}
