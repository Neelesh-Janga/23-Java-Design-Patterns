package com.neelesh.design.patterns.creational.builder.components;

public class Camera {
    private String brand;
    private int megapixels;
    private boolean opticalImageStabilization;
    private boolean nightMode;
    private String videoResolution;
    private boolean wideAngleLens;
    private int digitalZoom;

    public Camera(String brand, int megapixels, boolean opticalImageStabilization, boolean nightMode,
                  String videoResolution, boolean wideAngleLens, int digitalZoom) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.opticalImageStabilization = opticalImageStabilization;
        this.nightMode = nightMode;
        this.videoResolution = videoResolution;
        this.wideAngleLens = wideAngleLens;
        this.digitalZoom = digitalZoom;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public boolean isOpticalImageStabilization() {
        return opticalImageStabilization;
    }

    public void setOpticalImageStabilization(boolean opticalImageStabilization) {
        this.opticalImageStabilization = opticalImageStabilization;
    }

    public boolean isNightMode() {
        return nightMode;
    }

    public void setNightMode(boolean nightMode) {
        this.nightMode = nightMode;
    }

    public String getVideoResolution() {
        return videoResolution;
    }

    public void setVideoResolution(String videoResolution) {
        this.videoResolution = videoResolution;
    }

    public boolean isWideAngleLens() {
        return wideAngleLens;
    }

    public void setWideAngleLens(boolean wideAngleLens) {
        this.wideAngleLens = wideAngleLens;
    }

    public int getDigitalZoom() {
        return digitalZoom;
    }

    public void setDigitalZoom(int digitalZoom) {
        this.digitalZoom = digitalZoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megapixels=" + megapixels +
                ", opticalImageStabilization=" + opticalImageStabilization +
                ", nightMode=" + nightMode +
                ", videoResolution='" + videoResolution + '\'' +
                ", wideAngleLens=" + wideAngleLens +
                ", digitalZoom=" + digitalZoom + '\'' +
                '}';
    }
}
