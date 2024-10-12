package com.servo.service.LuciferPojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LuciferPojo {

    @Id
    private int HellId;
    private String HellName;
    private String HellVersion;

    @Override
    public String toString() {
        return "LuciferPojo{" +
                "HellId=" + HellId +
                ", HellName='" + HellName + '\'' +
                ", HellVersion='" + HellVersion + '\'' +
                '}';
    }

    public LuciferPojo(int hellId, String hellName, String hellVersion) {
        HellId = hellId;
        HellName = hellName;
        HellVersion = hellVersion;
    }

    public LuciferPojo() {
    }

    public int getHellId() {
        return HellId;
    }

    public void setHellId(int hellId) {
        HellId = hellId;
    }

    public String getHellName() {
        return HellName;
    }

    public void setHellName(String hellName) {
        HellName = hellName;
    }

    public String getHellVersion() {
        return HellVersion;
    }

    public void setHellVersion(String hellVersion) {
        HellVersion = hellVersion;
    }
}
