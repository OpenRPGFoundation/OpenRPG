package org.openrpg.OpenRPG;

public interface Levelable {
    int getLevel();
    int getExp();
    void increaseLevel();
    void addExperience(int exp);

}
