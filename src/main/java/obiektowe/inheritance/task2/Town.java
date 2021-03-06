package obiektowe.inheritance.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Town {
    private  List<Citizen> listOfCitizens = new ArrayList<>();

    public Town(Citizen... citizens) {
        listOfCitizens = Arrays.stream(citizens).toList();
    }

    public int howManyCanVote(){
        int count = 0;
        for (Citizen c: listOfCitizens){
            if (c.canVote()){
                count++;
            }
        }
        return count;
    }

    public void whoCanVote(){
        for (Citizen c: listOfCitizens){
            if (c.canVote()){
                System.out.println(c);
            }
        }
    }

}
