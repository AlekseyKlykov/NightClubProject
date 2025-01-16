package hw02_NightClubProject;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NightClassTest {
    private NightClub nightClub;
    private FaceControl faceControl;

    @BeforeEach
    void StartConfig(){
        faceControl = Mockito.mock(FaceControl.class);
        nightClub = new NightClub(faceControl,100,20);


    }

    @DisplayName("Должен впустить человека в стиле Ретро или Эко-стиль вне зависимости от дня недели")
    @Test
    void acceptLetInWithClothesStyleRetroOrEcoNotDay(){
        Mockito.when(faceControl.letPersonIntoTheClub("Ретро")).thenReturn(true);

        boolean expRes = true;

        boolean actRes = nightClub.letIn(4,"Ретро");
        System.out.println(actRes);
        System.out.println(expRes);

        Assertions.assertThat(expRes).isEqualTo(actRes);




    }

    @DisplayName("Не должен впускать человека в классическом")
    @Test
    void noAcceptLetInWithClothesStyleClassic(){
        Mockito.when(faceControl.letPersonIntoTheClub("Ретро")).thenReturn(true);

        boolean expRes = false;

        boolean actRes = nightClub.letIn(4,"Классический");


        Assertions.assertThat(expRes).isEqualTo(actRes);




    }
    @DisplayName("Не должен впускать человека в клуб без мест")
    @Test
    void noLetInClubeWithOutPlace(){
        Mockito.when(faceControl.letPersonIntoTheClub("Ретро")).thenReturn(true);
        nightClub.setCapacityOfPeople(100);
        nightClub.setActualNumberOfPeople(100);
        boolean expRes = false;

        boolean actRes = nightClub.letIn(4,"Классический");


        Assertions.assertThat(expRes).isEqualTo(actRes);




    }
    @DisplayName("Не должен выпускать человека с долгами")
    @Test
    void noLetGoClubeWithDebt(){
        Mockito.when(faceControl.letPersonOutOfClub(false)).thenReturn(true);
        nightClub.setCapacityOfPeople(100);
        nightClub.setActualNumberOfPeople(100);
        boolean expRes = true;

        boolean actRes = nightClub.letGo(true);


        Assertions.assertThat(expRes).isEqualTo(actRes);




    }

}
