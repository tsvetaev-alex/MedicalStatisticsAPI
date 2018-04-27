package MedicalStatisticsMinsk;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Template {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fact")
    @Expose
    private Fact fact;
    @SerializedName("reportTemplateRows")
    @Expose
    private List<ReportTemplateRow> reportTemplateRows = null;
    @SerializedName("reportTemplateColumns")
    @Expose
    private List<ReportTemplateColumn> reportTemplateColumns = null;
    @SerializedName("noPercent")
    @Expose
    private Boolean noPercent;
    @SerializedName("noTotal")
    @Expose
    private Boolean noTotal;
    @SerializedName("periodRequired")
    @Expose
    private Boolean periodRequired;
    @SerializedName("noSubTotal")
    @Expose
    private Boolean noSubTotal;
    @SerializedName("new")
    @Expose
    private Boolean _new;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public List<ReportTemplateRow> getReportTemplateRows() {
        return reportTemplateRows;
    }

    public void setReportTemplateRows(List<ReportTemplateRow> reportTemplateRows) {
        this.reportTemplateRows = reportTemplateRows;
    }

    public List<ReportTemplateColumn> getReportTemplateColumns() {
        return reportTemplateColumns;
    }

    public void setReportTemplateColumns(List<ReportTemplateColumn> reportTemplateColumns) {
        this.reportTemplateColumns = reportTemplateColumns;
    }

    public Boolean getNoPercent() {
        return noPercent;
    }

    public void setNoPercent(Boolean noPercent) {
        this.noPercent = noPercent;
    }

    public Boolean getNoTotal() {
        return noTotal;
    }

    public void setNoTotal(Boolean noTotal) {
        this.noTotal = noTotal;
    }

    public Boolean getPeriodRequired() {
        return periodRequired;
    }

    public void setPeriodRequired(Boolean periodRequired) {
        this.periodRequired = periodRequired;
    }

    public Boolean getNoSubTotal() {
        return noSubTotal;
    }

    public void setNoSubTotal(Boolean noSubTotal) {
        this.noSubTotal = noSubTotal;
    }

    public Boolean getNew() {
        return _new;
    }

    public void setNew(Boolean _new) {
        this._new = _new;
    }}

