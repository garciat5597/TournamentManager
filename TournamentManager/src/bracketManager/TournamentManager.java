package bracketManager;
import java.util.HashMap;
import java.util.ArrayList;

public class TournamentManager {
  // List of tournaments with their access codes as keys
  private HashMap<String, Tournament> mTournaments;
  // Singleton instance
  private static TournamentManager mInstance;
  
  private TournamentManager() {
    // Construct a new list of tournaments
    mTournaments = new HashMap<String, Tournament>();
  }
  
  public static TournamentManager getInstance() {
    // If singleton instance is uninstantiated, create it
    if (mInstance == null) {
      mInstance = new TournamentManager();
    }
    
    return mInstance;
  }
  
  public Tournament findTournament(String accessCode) {
    // Returns the specified tournament by access code. Returns null if not in the map
    return mTournaments.get(accessCode);
  }
  
  public void addTournament(Tournament tourney) {
    mTournaments.put(tourney.getAccessCode(), tourney);
  }
  
  public ArrayList<Tournament> getAllTournaments() {
    ArrayList<Tournament> allTournaments = new ArrayList<Tournament>();
    for (Tournament t : mTournaments.values()) {
      allTournaments.add(t);
    }
    
    return allTournaments;
  }
}
