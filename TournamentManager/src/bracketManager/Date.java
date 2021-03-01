package bracketManager;

public class Date {
  private String mMonth;
  private int mDay;
  private double mTime;
  
  public Date(String month, int day, double time) {
    mMonth = month;
    mDay = day;
    mTime = time;
  }
  
  public String getMonth() {
    return mMonth;
  }
  
  public int getDay() {
    return mDay;
  }
  
  public double getTime() {
    return mTime;
  }
}
