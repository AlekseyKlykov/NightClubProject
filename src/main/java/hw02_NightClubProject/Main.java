package hw02_NightClubProject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     FaceControl faceControl = new FaceControl();
    NightClub nightClub = new NightClub(faceControl,100,20);
    nightClub.letIn(3,"Ретро");

        }
    }
