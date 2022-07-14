package local;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class PriorityColumnModel extends AbstractColumn implements Serializable {

  private static final long serialVersionUID = 3594524453493971754L;
  public static final List<String> PRIORITIES = Arrays.asList("Low", "Normal", "High");

  @Override
  public void initDefaultValue() {
    this.header = "Priority";
    this.field = "priority";
  }

  public List<String> getPriorities() {
    return PRIORITIES;
  }
}
