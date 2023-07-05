
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Team> record = readRecordFromFile(file);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int counter = 0;
        int wins = 0;
        int losses = 0;
        
        for (Team tea : record) {

            if (tea.getHomeTeam().contains(team)) {
                counter += 1;

                if (tea.getHomeScore() >= tea.getAwayScore()) {
                    wins += 1;
                    //tea.setWins();
                } else {
                    losses += 1;
                    //tea.setLosses();
                }

                tea.playGame();
            } else if (tea.getAwayTeam().contains(team)) {
                counter += 1;

                if (tea.getAwayScore() >= tea.getHomeScore()) {
                    wins += 1;
                    //tea.setWins();
                } else {
                    losses += 1;
                    //tea.setLosses();
                }

                tea.playGame();
            }

        }
        
        System.out.println("Games: " +counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Team> readRecordFromFile(String file){
        ArrayList<Team> team = new ArrayList<>();
        try (Scanner scaan = new Scanner(Paths.get(file))){
            while(scaan.hasNextLine()){
                String s = scaan.nextLine();
                String[] parts = s.split(",");
                
                
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                
                team.add(new Team(homeTeam, awayTeam, homeScore, awayScore));
                
                
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        return team;
    }
}
