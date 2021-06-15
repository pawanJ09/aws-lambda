package com.pj.lambdareturn;

public class Patient {
  private String name;
  private String ssn;
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @return the ssn
   */
  public String getSsn() {
    return ssn;
  }
  /**
   * @param ssn the ssn to set
   */
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  
  @Override
  public String toString() {
    return "Patient [name=" + name + ", ssn=" + ssn + "]";
  }
  
}
