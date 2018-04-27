package MedicalStatisticsSpb;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReportTemplateRow {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("dimensionAttribute")
    @Expose
    private DimensionAttribute dimensionAttribute;
    @SerializedName("sortOrder")
    @Expose
    private Integer sortOrder;
    @SerializedName("filterCondition")
    @Expose
    private String filterCondition;
    @SerializedName("required")
    @Expose
    private Object required;
    @SerializedName("filter")
    @Expose
    private Boolean filter;
    @SerializedName("reqPerCent")
    @Expose
    private Boolean reqPerCent;
    @SerializedName("new")
    @Expose
    private Boolean _new;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DimensionAttribute getDimensionAttribute() {
        return dimensionAttribute;
    }

    public void setDimensionAttribute(DimensionAttribute dimensionAttribute) {
        this.dimensionAttribute = dimensionAttribute;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getFilterCondition() {
        return filterCondition;
    }

    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
    }

    public Object getRequired() {
        return required;
    }

    public void setRequired(Object required) {
        this.required = required;
    }

    public Boolean getFilter() {
        return filter;
    }

    public void setFilter(Boolean filter) {
        this.filter = filter;
    }

    public Boolean getReqPerCent() {
        return reqPerCent;
    }

    public void setReqPerCent(Boolean reqPerCent) {
        this.reqPerCent = reqPerCent;
    }

    public Boolean getNew() {
        return _new;
    }

    public void setNew(Boolean _new) {
        this._new = _new;
    }

}