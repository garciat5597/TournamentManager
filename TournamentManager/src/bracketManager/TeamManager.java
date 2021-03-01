package bracketManager;

public class TeamManager {
  private int minTeamMembers;
  private int maxTeamMembers;
  private int idealTeamMembers;
  
  public TeamManager() {
    
  }
  
  public void setSizes(int min, int max, int ideal) {
    minTeamMembers = min;
    maxTeamMembers = max;
    idealTeamMembers = ideal;
  }
}
