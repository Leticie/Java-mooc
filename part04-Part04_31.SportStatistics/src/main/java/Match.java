/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Match {
    
    private String homeTeam;
    private String visitingTeam;
    private int pointsHomeTeam;
    private int pointsVisitingTeam;
    
    public Match(String inputHomeTeam, String inputVisitingTeam, int inputPointsHomeTeam, int inputPointsVisitingTeam) {
        this.homeTeam = inputHomeTeam;
        this.visitingTeam = inputVisitingTeam;
        this.pointsHomeTeam = inputPointsHomeTeam;
        this.pointsVisitingTeam = inputPointsVisitingTeam;      
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public String getWinner() {
        if (this.pointsHomeTeam > this.pointsVisitingTeam) {
            return homeTeam;
        }
        return visitingTeam;
    }
    
    public String getLooser() {
        if (this.pointsHomeTeam < this.pointsVisitingTeam) {
            return homeTeam;
        }
        return visitingTeam;
    }
    
    
 
}
    

