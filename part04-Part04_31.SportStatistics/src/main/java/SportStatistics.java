
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        ArrayList<Match> results = readRecordsFromFile(file);
        
        System.out.println("Games: " + calculateGames(team, results));
        System.out.println("Wins: " + calculateWins(team, results));
        System.out.println("Losses: " + calculateLosses(team, results));
    }
    
    public static ArrayList<Match> readRecordsFromFile(String file){
        ArrayList<Match> rows = new ArrayList<>();
        
        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()){
                String row = scanFile.nextLine();
                
                String[] pieces = row.split(",");
                String homeTeam = pieces[0];
                String visitingTeam = pieces[1];
                int pointsHomeTeam = Integer.valueOf(pieces[2]);
                int pointsVisitingTeam = Integer.valueOf(pieces[3]);
                
                rows.add(new Match(homeTeam, visitingTeam, pointsHomeTeam, pointsVisitingTeam));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rows;     
    }
    
    public static int calculateGames(String team, ArrayList<Match> results) {
        int games = 0;
   
        for (Match result : results) {
            if (team.equals(result.getHomeTeam()) || team.equals(result.getVisitingTeam())) {
                games += 1;
            }
        }
        return games;
    }
    
    public static int calculateWins(String team, ArrayList<Match> results) {
        int wins = 0;
        
        for (Match result : results) {
            if (team.equals(result.getWinner())) {
                wins += 1;
            } 
        }
        return wins;
    }
    
    public static int calculateLosses(String team, ArrayList<Match> results) {
        int losses = 0;
        
        for (Match result : results) {
            if (team.equals(result.getLooser())) {
                losses += 1;
            } 
        }
        return losses;
    }

}
