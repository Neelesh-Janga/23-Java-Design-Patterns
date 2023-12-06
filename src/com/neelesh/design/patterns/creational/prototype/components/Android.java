package com.neelesh.design.patterns.creational.prototype.components;

public class Android extends Mobile {
    public double androidVersion;
    public String androidCodeName;

    public Android() {
    }

    public Android(Android android) {
        super(android);
        if (android != null) {
            androidVersion = android.androidVersion;
            androidCodeName = android.androidCodeName;
        }
    }

    @Override
    public Mobile clone() throws CloneNotSupportedException {
        return new Android(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Android) && !super.equals(obj)) return false;
        Android and = (Android) obj;
        return super.equals(and) && androidVersion == and.androidVersion && androidCodeName.equals(and.androidCodeName);
    }

    @Override
    public String toString() {
        return "Android{" +
                "androidVersion=" + androidVersion +
                ", androidCodeName='" + androidCodeName + '\'' +
                ", touchScreen=" + touchScreen +
                ", waterResistance=" + waterResistance +
                ", color='" + color + '\'' +
                ", network='" + network + '\'' +
                ", camera=" + camera +
                ", fps=" + fps +
                ", simSlots=" + simSlots +
                ", display='" + display + '\'' +
                '}';
    }
}
