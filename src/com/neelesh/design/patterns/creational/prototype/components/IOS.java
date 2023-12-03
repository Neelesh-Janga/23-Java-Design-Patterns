package com.neelesh.design.patterns.creational.prototype.components;

public class IOS extends Mobile {

    public double iOSVersion;
    public String iOSCodeName;

    public IOS() {
    }

    public IOS(IOS ios) {
        super(ios);
        if (ios != null) {
            iOSVersion = ios.iOSVersion;
            iOSCodeName = ios.iOSCodeName;
        }
    }

    @Override
    public Mobile clone() {
        return new IOS(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IOS) && super.equals(obj)) return false;
        IOS ios = (IOS) obj;
        return super.equals(ios) && iOSVersion == ios.iOSVersion && iOSCodeName.equals(ios.iOSCodeName);
    }

    @Override
    public String toString() {
        return "IOS{" +
                "iOSVersion=" + iOSVersion +
                ", iOSCodeName='" + iOSCodeName + '\'' +
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
