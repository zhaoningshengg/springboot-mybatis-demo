package pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName ais_static_download_29
 */
@TableName(value ="ais_static_download_29")
@Data
public class AisStaticDownload29 implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer mmsi;

    /**
     * 
     */
    private Integer imo;

    /**
     * 
     */
    private String callsign;

    /**
     * 
     */
    private String shipname;

    /**
     * 
     */
    private Integer shiptype;

    /**
     * 
     */
    private Double shiplength;

    /**
     * 
     */
    private Double shipbreadth;

    /**
     * 
     */
    private Integer fixingdevice;

    /**
     * 
     */
    private String eta;

    /**
     * 
     */
    private Double draft;

    /**
     * 
     */
    private String destination;

    /**
     * 
     */
    private String devicetype;

    /**
     * 
     */
    private Integer countrycode;

    /**
     * 
     */
    private String receivetime;

    /**
     * 
     */
    private Integer sourceid;

    /**
     * 
     */
    private Integer tobow;

    /**
     * 
     */
    private Integer tostern;

    /**
     * 
     */
    private Integer toport;

    /**
     * 
     */
    private Integer tostarboard;

    /**
     * 
     */
    private Integer messagetype;

    /**
     * 
     */
    private Integer basestationid;

    /**
     * 
     */
    private Integer mixshiptype;

    /**
     * 
     */
    private String dwt;

    /**
     * 
     */
    private String gt;

    /**
     * 
     */
    private String originaltype;

    /**
     * 
     */
    private String shiptypelabel;

    /**
     * 
     */
    private String shiptypeenlabel;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AisStaticDownload29 other = (AisStaticDownload29) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMmsi() == null ? other.getMmsi() == null : this.getMmsi().equals(other.getMmsi()))
            && (this.getImo() == null ? other.getImo() == null : this.getImo().equals(other.getImo()))
            && (this.getCallsign() == null ? other.getCallsign() == null : this.getCallsign().equals(other.getCallsign()))
            && (this.getShipname() == null ? other.getShipname() == null : this.getShipname().equals(other.getShipname()))
            && (this.getShiptype() == null ? other.getShiptype() == null : this.getShiptype().equals(other.getShiptype()))
            && (this.getShiplength() == null ? other.getShiplength() == null : this.getShiplength().equals(other.getShiplength()))
            && (this.getShipbreadth() == null ? other.getShipbreadth() == null : this.getShipbreadth().equals(other.getShipbreadth()))
            && (this.getFixingdevice() == null ? other.getFixingdevice() == null : this.getFixingdevice().equals(other.getFixingdevice()))
            && (this.getEta() == null ? other.getEta() == null : this.getEta().equals(other.getEta()))
            && (this.getDraft() == null ? other.getDraft() == null : this.getDraft().equals(other.getDraft()))
            && (this.getDestination() == null ? other.getDestination() == null : this.getDestination().equals(other.getDestination()))
            && (this.getDevicetype() == null ? other.getDevicetype() == null : this.getDevicetype().equals(other.getDevicetype()))
            && (this.getCountrycode() == null ? other.getCountrycode() == null : this.getCountrycode().equals(other.getCountrycode()))
            && (this.getReceivetime() == null ? other.getReceivetime() == null : this.getReceivetime().equals(other.getReceivetime()))
            && (this.getSourceid() == null ? other.getSourceid() == null : this.getSourceid().equals(other.getSourceid()))
            && (this.getTobow() == null ? other.getTobow() == null : this.getTobow().equals(other.getTobow()))
            && (this.getTostern() == null ? other.getTostern() == null : this.getTostern().equals(other.getTostern()))
            && (this.getToport() == null ? other.getToport() == null : this.getToport().equals(other.getToport()))
            && (this.getTostarboard() == null ? other.getTostarboard() == null : this.getTostarboard().equals(other.getTostarboard()))
            && (this.getMessagetype() == null ? other.getMessagetype() == null : this.getMessagetype().equals(other.getMessagetype()))
            && (this.getBasestationid() == null ? other.getBasestationid() == null : this.getBasestationid().equals(other.getBasestationid()))
            && (this.getMixshiptype() == null ? other.getMixshiptype() == null : this.getMixshiptype().equals(other.getMixshiptype()))
            && (this.getDwt() == null ? other.getDwt() == null : this.getDwt().equals(other.getDwt()))
            && (this.getGt() == null ? other.getGt() == null : this.getGt().equals(other.getGt()))
            && (this.getOriginaltype() == null ? other.getOriginaltype() == null : this.getOriginaltype().equals(other.getOriginaltype()))
            && (this.getShiptypelabel() == null ? other.getShiptypelabel() == null : this.getShiptypelabel().equals(other.getShiptypelabel()))
            && (this.getShiptypeenlabel() == null ? other.getShiptypeenlabel() == null : this.getShiptypeenlabel().equals(other.getShiptypeenlabel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMmsi() == null) ? 0 : getMmsi().hashCode());
        result = prime * result + ((getImo() == null) ? 0 : getImo().hashCode());
        result = prime * result + ((getCallsign() == null) ? 0 : getCallsign().hashCode());
        result = prime * result + ((getShipname() == null) ? 0 : getShipname().hashCode());
        result = prime * result + ((getShiptype() == null) ? 0 : getShiptype().hashCode());
        result = prime * result + ((getShiplength() == null) ? 0 : getShiplength().hashCode());
        result = prime * result + ((getShipbreadth() == null) ? 0 : getShipbreadth().hashCode());
        result = prime * result + ((getFixingdevice() == null) ? 0 : getFixingdevice().hashCode());
        result = prime * result + ((getEta() == null) ? 0 : getEta().hashCode());
        result = prime * result + ((getDraft() == null) ? 0 : getDraft().hashCode());
        result = prime * result + ((getDestination() == null) ? 0 : getDestination().hashCode());
        result = prime * result + ((getDevicetype() == null) ? 0 : getDevicetype().hashCode());
        result = prime * result + ((getCountrycode() == null) ? 0 : getCountrycode().hashCode());
        result = prime * result + ((getReceivetime() == null) ? 0 : getReceivetime().hashCode());
        result = prime * result + ((getSourceid() == null) ? 0 : getSourceid().hashCode());
        result = prime * result + ((getTobow() == null) ? 0 : getTobow().hashCode());
        result = prime * result + ((getTostern() == null) ? 0 : getTostern().hashCode());
        result = prime * result + ((getToport() == null) ? 0 : getToport().hashCode());
        result = prime * result + ((getTostarboard() == null) ? 0 : getTostarboard().hashCode());
        result = prime * result + ((getMessagetype() == null) ? 0 : getMessagetype().hashCode());
        result = prime * result + ((getBasestationid() == null) ? 0 : getBasestationid().hashCode());
        result = prime * result + ((getMixshiptype() == null) ? 0 : getMixshiptype().hashCode());
        result = prime * result + ((getDwt() == null) ? 0 : getDwt().hashCode());
        result = prime * result + ((getGt() == null) ? 0 : getGt().hashCode());
        result = prime * result + ((getOriginaltype() == null) ? 0 : getOriginaltype().hashCode());
        result = prime * result + ((getShiptypelabel() == null) ? 0 : getShiptypelabel().hashCode());
        result = prime * result + ((getShiptypeenlabel() == null) ? 0 : getShiptypeenlabel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mmsi=").append(mmsi);
        sb.append(", imo=").append(imo);
        sb.append(", callsign=").append(callsign);
        sb.append(", shipname=").append(shipname);
        sb.append(", shiptype=").append(shiptype);
        sb.append(", shiplength=").append(shiplength);
        sb.append(", shipbreadth=").append(shipbreadth);
        sb.append(", fixingdevice=").append(fixingdevice);
        sb.append(", eta=").append(eta);
        sb.append(", draft=").append(draft);
        sb.append(", destination=").append(destination);
        sb.append(", devicetype=").append(devicetype);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", receivetime=").append(receivetime);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", tobow=").append(tobow);
        sb.append(", tostern=").append(tostern);
        sb.append(", toport=").append(toport);
        sb.append(", tostarboard=").append(tostarboard);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", basestationid=").append(basestationid);
        sb.append(", mixshiptype=").append(mixshiptype);
        sb.append(", dwt=").append(dwt);
        sb.append(", gt=").append(gt);
        sb.append(", originaltype=").append(originaltype);
        sb.append(", shiptypelabel=").append(shiptypelabel);
        sb.append(", shiptypeenlabel=").append(shiptypeenlabel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}