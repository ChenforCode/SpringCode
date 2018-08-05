package liuchen;

public class TextEditor {

    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("inside Texteditor constructor !!!");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.check();
    }
}
