package com.mcgarvey;

public interface BitRequirements {
    /**
     * Represents and abstraction containing the required methods for the Bit class
     * @author Connor McGarvey
     * @param value
     */

    void set(boolean value); // sets the value of the bit

    void toggle(); // changes the value from true to false or false to true

    void set(); // sets the bit to true

    void clear(); // sets the bit to false

    boolean getValue(); // returns the current value

    Bit and(Bit other); // performs and on two bits and returns a new bit set to the result

    Bit or(Bit other); // performs or on two bits and returns a new bit set to the result

    Bit xor(Bit other); // performs xor on two bits and returns a new bit set to the result

    Bit not(); // performs not on the existing bit, returning the result as a new bit

    @Override
    String toString(); // returns “t” or “f”

}
