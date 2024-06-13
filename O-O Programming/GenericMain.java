package ch16;

public class GenericMain {
    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat ("whiteCat");
        ISpeakable blackDog = new Dog("blackDog");

        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(blackDog);


    }
}
