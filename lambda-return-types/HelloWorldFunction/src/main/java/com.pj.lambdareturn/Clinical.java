package com.pj.lambdareturn;

public class Clinical {
  private String bp;
  private int heartRate;
  /**
   * @return the bp
   */
  public String getBp() {
    return bp;
  }
  /**
   * @param bp the bp to set
   */
  public void setBp(String bp) {
    this.bp = bp;
  }
  /**
   * @return the heartRate
   */
  public int getHeartRate() {
    return heartRate;
  }
  /**
   * @param heartRate the heartRate to set
   */
  public void setHeartRate(int heartRate) {
    this.heartRate = heartRate;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  
  @Override
  public String toString() {
    return "Clinical [bp=" + bp + ", heartRate=" + heartRate + "]";
  }

}
