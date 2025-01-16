package hw02_NightClubProject;

public class FaceControl {

    public boolean letPersonIntoTheClub(String clothesStyle){

        if ((clothesStyle == "Ретро" || clothesStyle == "Эко-стиль") )
            return true;
       else return false;
    }
    public boolean letPersonOutOfClub(boolean isDebt){

        if(!isDebt)
            return false;

        return true;


    }


}
