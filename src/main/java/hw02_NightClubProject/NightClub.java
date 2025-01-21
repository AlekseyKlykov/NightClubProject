package hw02_NightClubProject;

public class NightClub {

    private int capacityOfPeople;
    private int actualNumberOfPeople;
    public final FaceControl faceControl;




    NightClub(FaceControl fc,int capacityOfPeople,int actualNumberOfPeople){
        this.capacityOfPeople = capacityOfPeople;
        this.actualNumberOfPeople = actualNumberOfPeople;

        this.faceControl = fc;



    }



    public int getCapacityOfPeople() {
        return capacityOfPeople;
    }

    public void setCapacityOfPeople(int capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
    }

    public int getActualNumberOfPeople() {
        return actualNumberOfPeople;
    }

    public void setActualNumberOfPeople(int actualNumberOfPeople) {
        if(actualNumberOfPeople <= this.capacityOfPeople) {
            this.actualNumberOfPeople = actualNumberOfPeople;
        }
    }





   public boolean letIn(int dayOfTheWeek,String clothesStyle){
    if(this.actualNumberOfPeople < this.capacityOfPeople) {
        if((dayOfTheWeek == 3 || dayOfTheWeek == 1 || dayOfTheWeek == 6 )) {
            this.actualNumberOfPeople++;
            System.out.println("A man entered the club");
            return true;
        }
        boolean sln = faceControl.letPersonIntoTheClub(clothesStyle);

        if(sln) {
            this.actualNumberOfPeople++;
            System.out.println("A man entered the club");

            return true;
        }

        else {
            System.out.println("The man did not enter the club");
            return false;
        }
        }

    else {
        System.out.println("There are no seats");
        return false;
    }


   };
    public  boolean letGo(boolean isDebt){


            boolean sln = faceControl.letPersonOutOfClub(isDebt);
            if(!sln) {
                this.actualNumberOfPeople--;
                return true;
            }
            else {
                System.out.println("Человека не выпустили из клуба.  Есть долги.");
                return false;
            }



    };
}
