package sample.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.model.Model;



public class Controller{

    @FXML
    private TextField userGuessTF;
    @FXML
    private TextField wordToGuessTF;
    @FXML
    private Button startGameButton;
    @FXML
    private Button guessButton;
    @FXML
    private TextField wordLengthTF;
    @FXML
    private TextField usedLettersTF;



    Model model = new Model();

    public Controller(){
        model.wordBank();
    }

    @FXML
    public void onStartGame(ActionEvent event){
            model.randomWord();
            model.coveredWord();
            if(model.getCoveredWord() != null) {
                wordToGuessTF.setText(model.getCoveredWord());
                wordLengthTF.setText(Integer.toString(model.getCoveredWord().length()));
                userGuessTF.setVisible(true);
                guessButton.setVisible(true);
                usedLettersTF.setText("");
                startGameButton.setText("Od nowa!");
                model.setAttempts();
            }
    }

    @FXML
    public void userChoice() {
        if (userGuessTF.getText().length() >= 1 && userGuessTF.getText().length() < 2) {

            if (model.getCoveredWord() != null) {
                //model.setUserGuess(userGuessTF.getText().charAt(0));

                //model.compareToUser(userGuessTF.getText().charAt(0));
                model.setUserGuess(userGuessTF.getText());
                model.compareToUser();
                usedLettersTF.appendText(userGuessTF.getText(0, 1) + " ");
                wordToGuessTF.setText(model.getCoveredWord());
                userGuessTF.setText("");
                if(model.isOver()){
                    if(model.isOver() && model.getAttempts() == 3){
                        System.out.println("you lose");
                    }else {
                        System.out.println("won");
                    }
                }

//                if(model.isOver() && model.getAttempts() == 3) {
//                    userGuessTF.setVisible(false);
//                    guessButton.setVisible(false);
//                    usedLettersTF.setText("You Lose! :(");
//                }
            }
        }

    }

}
