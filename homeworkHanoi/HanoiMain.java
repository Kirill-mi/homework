package homeworkHanoi;

import util.UserInput;

/**
 * homeworkHanoi
 * 02.02.2021
 * Mikhalochkin Kirill
 */
public class HanoiMain {


    public static void main(String[] args) {
        IHanoi game1 = new HanoiHand();
        IHanoi game2 = new HanoiAutoStupid();
        IHanoi game3 = new HanoiAutoSmart();
        IHanoi game;
        String typeOfSystem = UserInput.getUserInputString(" Enter:\nM- for play by hand \n" +
                "C-for  computer play ");
        typeOfSystem = typeOfSystem.toUpperCase();
        if (typeOfSystem.equals("M")) {
            game = game1;
            String typeOfGame = UserInput.getUserInputString(" Enter:\nN- for new game \n" +
                    "L-for loading game\nS-for show saved game ");
            typeOfGame = typeOfGame.toUpperCase();
            switch (typeOfGame) {
                case "N":
                    game.setField();
                    game.creatorOfField();
                    game.printField();
                    game.playGame(game.getField());
                    break;
                case "L":
                    game.loadField();
                    game.getField();
                    game.printField();
                    game.playGame(game.getField());
                    break;
                case "S":

                    break;
                default:
                    System.out.println("Enter correct symbol");
                    break;
            }

        } else if (typeOfSystem.equals("C")) {
            String typeOfGame = UserInput.getUserInputString(" Enter:\nA- for smart computer \n" +
                    "B-for stupid computer");
            typeOfGame = typeOfGame.toUpperCase();
            switch (typeOfGame) {
                case "A":
                    game = game3;
                    game.setField();
                    game.creatorOfField();
                    game.printField();
                    game.playGame(game.getField());
                    break;
                case "B":
                    game = game2;
                    game.loadField();
                    game.getField();
                    game.printField();
                    game.playGame(game.getField());
                    break;
                default:
                    System.out.println("Enter correct symbol");
                    break;
            }
        }
    }
}
