package main;
public class FootballTeam implements Comparable <FootballTeam>{
   public int gamesWon;
   public FootballTeam(int gamesWon){
      if(gamesWon < 0){
         throw new IllegalArgumentException(
               "Not possible to have less than 0 games won!" +
                     "(was + " + gamesWon + ")");
      }
      this.gamesWon = gamesWon;
   }
   public int getGameswon() {
      return gamesWon;
   }

   @Override
   public int compareTo(FootballTeam o){
      return 1;
   }
}//class
