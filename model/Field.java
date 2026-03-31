package model;

public class Field {
    private String fieldName;
    private String cropType;
    private double yield;

    // Constructor
    public Field(String fieldName, String cropType, double yield) {
        this.fieldName = fieldName;
        this.cropType = cropType;
        this.yield = yield;
    }

    // Getters
    public String getFieldName() {
        return fieldName;
    }

    public String getCropType() {
        return cropType;
    }

    public double getYield() {
        return yield;
    }

    // Display field info
    @Override
    public String toString() {
        return String.format("%-10s | %-12s | %.2f tons",
                fieldName, cropType, yield);
    }
}