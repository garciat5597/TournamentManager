package bracketManager;
import java.util.ArrayList;
import java.util.Date;

public class Tournament {
  private String mName;
  private String mAccessCode;
  private Date startDate;
  private Date endDate;
  private TeamManager mTeamManager;
  private ArrayList<String> mUnattachedParticipants;
  
  public String getAccessCode() {
    return mAccessCode;
  }
}
