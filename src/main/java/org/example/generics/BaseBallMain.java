package org.example.generics;
record BaseBallPlayer(String name,String position){}
public class BaseBallMain {
    public static void main(String[] args) {
        BaseBallTeam hyderabad=new BaseBallTeam("Hyderabad");
        BaseBallTeam  bangalore=new BaseBallTeam("Bangalore");
        //scoreResult();



    }
    public static void scoreResult(BaseBallTeam team1,
                                   int t1_score,BaseBallTeam team2,
                                   int t2_score){
        String message= team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score, t1_score);
      //  System.out.println(team1,message,team2);

    }
}
