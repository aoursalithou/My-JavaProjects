package ch16;

public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    public GenericSpeakingSchool(ISpeakable speakable){
        this.speakable = speakable;
    }

    public void learnTosSpeak(){
            speakable.speak();
    }

}
