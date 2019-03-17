package org.cj.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {
    private static Map<String, IEmployee> map = new HashMap();

    public Leader() {
        map.put("a", new EmployeeA());
        map.put("b", new EmployeeB());

    }

    public void doWork(String command) {
        IEmployee iEmployee = map.get(command);
        if (iEmployee != null) {
            iEmployee.doWork(command);
        }
    }
}
