package week4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class FootballTeamTest
{

   private static final int THREE_GAMES_WON = 3;

   @Test
   void constructorShouldSetGamesWon(){
      FootballTeam team = new FootballTeam(THREE_GAMES_WON);

      assertThat(team.getGamesWon())
            .as("number of games won")
            .isEqualTo(THREE_GAMES_WON);
   }

   @ParameterizedTest
   @ValueSource(ints = {0, 1, 3, 10})
   void constructorShouldSetGamesWon(int numberOfGamesWon){
      FootballTeam team = new FootballTeam(numberOfGamesWon);

      assertThat(team.getGamesWon())
            .as("number of games won")
            .isEqualTo(numberOfGamesWon);
   }

   @ParameterizedTest
   @ValueSource(ints = {-10, -1})
   void constructorShouldThrowExceptionForIllegalGamesNumber(int illegalNumberOfGames){
      assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> {new FootballTeam(illegalNumberOfGames); });
   }

   private static final int ANY_NUMBER = 123;

   @Test
   void shouldBePossibleToCompareTeams(){
      FootballTeam team = new FootballTeam(ANY_NUMBER);

      assertThat(team).isInstanceOf(Comparable.class);
   }

   @Test
   void teamsWithMoreMatchesWonShouldBeGreater(){
      FootballTeam team_2 = new FootballTeam(2);
      FootballTeam team_3 = new FootballTeam(3);

      assertThat(team_3.compareTo(team_2)).isGreaterThan(0);
   }
}//class
