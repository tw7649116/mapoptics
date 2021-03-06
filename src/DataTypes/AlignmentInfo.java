package DataTypes;

/*
 * @author Josie
 */
public class AlignmentInfo {

    private String qryAlignStart;
    private String qryAlignEnd ;
    private String refAlignStart ;
    private String refAlignEnd ;
    private String orientation ;
    private String confidence ;
    private String hitEnum ;
    private String labelChannel ;
    private String alignment ;

    public String getQryAlignStart() {
        return qryAlignStart;
    }

    public void setQryAlignStart(String qryAlignStart) {
        this.qryAlignStart = qryAlignStart;
    }

    public String getQryAlignEnd() {
        return qryAlignEnd;
    }

    public void setQryAlignEnd(String qryAlignEnd) {
        this.qryAlignEnd = qryAlignEnd;
    }

    public String getRefAlignStart() {
        return refAlignStart;
    }

    public void setRefAlignStart(String refAlignStart) {
        this.refAlignStart = refAlignStart;
    }

    public String getRefAlignEnd() {
        return refAlignEnd;
    }

    public void setRefAlignEnd(String refAlignEnd) {
        this.refAlignEnd = refAlignEnd;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getHitEnum() {
        return hitEnum;
    }

    public void setHitEnum(String hitEnum) {
        this.hitEnum = hitEnum;
    }

    public String getLabelChannel() {
        return labelChannel;
    }

    public void setLabelChannel(String labelChannel) {
        this.labelChannel = labelChannel;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public AlignmentInfo(String qryAlignStart, String qryAlignEnd, String refAlignStart, String refAlignEnd, String orientation, String confidence, String hitEnum, String labelChannel, String alignment) {
        this.qryAlignStart = qryAlignStart;
        this.qryAlignEnd = qryAlignEnd;
        this.refAlignStart = refAlignStart;
        this.refAlignEnd = refAlignEnd;
        this.orientation = orientation;
        this.confidence = confidence;
        this.hitEnum = hitEnum;
        this.labelChannel = labelChannel;
        this.alignment = alignment;
    }
}
