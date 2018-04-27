package MedicalStatisticsSpb;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sort {

    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("property")
    @Expose
    private String property;
    @SerializedName("ignoreCase")
    @Expose
    private Boolean ignoreCase;
    @SerializedName("nullHandling")
    @Expose
    private String nullHandling;
    @SerializedName("descending")
    @Expose
    private Boolean descending;
    @SerializedName("ascending")
    @Expose
    private Boolean ascending;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Boolean getIgnoreCase() {
        return ignoreCase;
    }

    public void setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

    public String getNullHandling() {
        return nullHandling;
    }

    public void setNullHandling(String nullHandling) {
        this.nullHandling = nullHandling;
    }

    public Boolean getDescending() {
        return descending;
    }

    public void setDescending(Boolean descending) {
        this.descending = descending;
    }

    public Boolean getAscending() {
        return ascending;
    }

    public void setAscending(Boolean ascending) {
        this.ascending = ascending;
    }

}