public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven()-x;
    }

    public int preparationTimeInMinutes(int c){
        return 2*c;        
    }

    public int totalTimeInMinutes(int c, int x){
        return preparationTimeInMinutes(c)+x;
    }
}
