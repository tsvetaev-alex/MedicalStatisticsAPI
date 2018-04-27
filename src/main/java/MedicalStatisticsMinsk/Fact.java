package MedicalStatisticsMinsk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fact {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("parentId")
    @Expose
    private Integer parentId;
    @SerializedName("dimension")
    @Expose
    private String dimension;
    @SerializedName("attribute")
    @Expose
    private String attribute;
    @SerializedName("translation")
    @Expose
    private String translation;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("sortOrder")
    @Expose
    private String sortOrder;
    @SerializedName("hierarchy")
    @Expose
    private Object hierarchy;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("reportPeriodLabel")
    @Expose
    private String reportPeriodLabel;
    @SerializedName("anyPeriod")
    @Expose
    private Boolean anyPeriod;
    @SerializedName("noPercent")
    @Expose
    private Boolean noPercent;
    @SerializedName("noPeriod")
    @Expose
    private Boolean noPeriod;
    @SerializedName("noFilter")
    @Expose
    private Boolean noFilter;
    @SerializedName("noTotal")
    @Expose
    private Boolean noTotal;
    @SerializedName("new")
    @Expose
    private Boolean _new;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Object getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Object hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportPeriodLabel() {
        return reportPeriodLabel;
    }

    public void setReportPeriodLabel(String reportPeriodLabel) {
        this.reportPeriodLabel = reportPeriodLabel;
    }

    public Boolean getAnyPeriod() {
        return anyPeriod;
    }

    public void setAnyPeriod(Boolean anyPeriod) {
        this.anyPeriod = anyPeriod;
    }

    public Boolean getNoPercent() {
        return noPercent;
    }

    public void setNoPercent(Boolean noPercent) {
        this.noPercent = noPercent;
    }

    public Boolean getNoPeriod() {
        return noPeriod;
    }

    public void setNoPeriod(Boolean noPeriod) {
        this.noPeriod = noPeriod;
    }

    public Boolean getNoFilter() {
        return noFilter;
    }

    public void setNoFilter(Boolean noFilter) {
        this.noFilter = noFilter;
    }

    public Boolean getNoTotal() {
        return noTotal;
    }

    public void setNoTotal(Boolean noTotal) {
        this.noTotal = noTotal;
    }

    public Boolean getNew() {
        return _new;
    }

    public void setNew(Boolean _new) {
        this._new = _new;
    }

}
