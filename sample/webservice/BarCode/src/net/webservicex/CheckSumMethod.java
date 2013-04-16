// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package net.webservicex;

public enum CheckSumMethod {

    NONE("None"),
  

    MODULO_10("Modulo10");
  
  
    private final String value;
  
    CheckSumMethod(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static CheckSumMethod fromValue(String v) {
        if (v != null) {
            for (CheckSumMethod c: CheckSumMethod.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}