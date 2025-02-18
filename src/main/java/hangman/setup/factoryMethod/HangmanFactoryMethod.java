package hangman.setup.factoryMethod;

import hangman.model.Language;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import hangman.model.*;

abstract public class HangmanFactoryMethod {
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
    abstract public GameScore OriginalScore();
}
