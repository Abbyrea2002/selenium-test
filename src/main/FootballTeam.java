package main;
public class FootballTeam implements Comparable <FootballTeam>{
   public int gamesWon;

//    public FootballTeam(int gamesWon){
//        this.gamesWon = gamesWon;
//    }

   public int getGamesWon(){
      return gamesWon;
   }

   public FootballTeam(int gamesWon){
      if(gamesWon < 0){
         throw new IllegalArgumentException(
               "Not possible to have less than 0 games won!" +
                     "(was + " + gamesWon + ")");
      }
      this.gamesWon = gamesWon;
   }

   @Override
   public int compareTo(FootballTeam o){
      if(gamesWon > o.getGamesWon()){
         return 1;
      }
      return 0;
   }
}//class
