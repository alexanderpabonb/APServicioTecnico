/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AlexPabon
 */
@Entity
@Table(name = "APEX$_WS_ROWS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApexWsRows.findAll", query = "SELECT a FROM ApexWsRows a"),
    @NamedQuery(name = "ApexWsRows.findById", query = "SELECT a FROM ApexWsRows a WHERE a.id = :id"),
    @NamedQuery(name = "ApexWsRows.findByWsAppId", query = "SELECT a FROM ApexWsRows a WHERE a.wsAppId = :wsAppId"),
    @NamedQuery(name = "ApexWsRows.findByDataGridId", query = "SELECT a FROM ApexWsRows a WHERE a.dataGridId = :dataGridId"),
    @NamedQuery(name = "ApexWsRows.findByUniqueValue", query = "SELECT a FROM ApexWsRows a WHERE a.uniqueValue = :uniqueValue"),
    @NamedQuery(name = "ApexWsRows.findByTags", query = "SELECT a FROM ApexWsRows a WHERE a.tags = :tags"),
    @NamedQuery(name = "ApexWsRows.findByParentRowId", query = "SELECT a FROM ApexWsRows a WHERE a.parentRowId = :parentRowId"),
    @NamedQuery(name = "ApexWsRows.findByOwner", query = "SELECT a FROM ApexWsRows a WHERE a.owner = :owner"),
    @NamedQuery(name = "ApexWsRows.findByGeocode", query = "SELECT a FROM ApexWsRows a WHERE a.geocode = :geocode"),
    @NamedQuery(name = "ApexWsRows.findByLoadOrder", query = "SELECT a FROM ApexWsRows a WHERE a.loadOrder = :loadOrder"),
    @NamedQuery(name = "ApexWsRows.findByChangeCount", query = "SELECT a FROM ApexWsRows a WHERE a.changeCount = :changeCount"),
    @NamedQuery(name = "ApexWsRows.findByCreatedOn", query = "SELECT a FROM ApexWsRows a WHERE a.createdOn = :createdOn"),
    @NamedQuery(name = "ApexWsRows.findByCreatedBy", query = "SELECT a FROM ApexWsRows a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApexWsRows.findByUpdatedOn", query = "SELECT a FROM ApexWsRows a WHERE a.updatedOn = :updatedOn"),
    @NamedQuery(name = "ApexWsRows.findByUpdatedBy", query = "SELECT a FROM ApexWsRows a WHERE a.updatedBy = :updatedBy"),
    @NamedQuery(name = "ApexWsRows.findByC001", query = "SELECT a FROM ApexWsRows a WHERE a.c001 = :c001"),
    @NamedQuery(name = "ApexWsRows.findByC002", query = "SELECT a FROM ApexWsRows a WHERE a.c002 = :c002"),
    @NamedQuery(name = "ApexWsRows.findByC003", query = "SELECT a FROM ApexWsRows a WHERE a.c003 = :c003"),
    @NamedQuery(name = "ApexWsRows.findByC004", query = "SELECT a FROM ApexWsRows a WHERE a.c004 = :c004"),
    @NamedQuery(name = "ApexWsRows.findByC005", query = "SELECT a FROM ApexWsRows a WHERE a.c005 = :c005"),
    @NamedQuery(name = "ApexWsRows.findByC006", query = "SELECT a FROM ApexWsRows a WHERE a.c006 = :c006"),
    @NamedQuery(name = "ApexWsRows.findByC007", query = "SELECT a FROM ApexWsRows a WHERE a.c007 = :c007"),
    @NamedQuery(name = "ApexWsRows.findByC008", query = "SELECT a FROM ApexWsRows a WHERE a.c008 = :c008"),
    @NamedQuery(name = "ApexWsRows.findByC009", query = "SELECT a FROM ApexWsRows a WHERE a.c009 = :c009"),
    @NamedQuery(name = "ApexWsRows.findByC010", query = "SELECT a FROM ApexWsRows a WHERE a.c010 = :c010"),
    @NamedQuery(name = "ApexWsRows.findByC011", query = "SELECT a FROM ApexWsRows a WHERE a.c011 = :c011"),
    @NamedQuery(name = "ApexWsRows.findByC012", query = "SELECT a FROM ApexWsRows a WHERE a.c012 = :c012"),
    @NamedQuery(name = "ApexWsRows.findByC013", query = "SELECT a FROM ApexWsRows a WHERE a.c013 = :c013"),
    @NamedQuery(name = "ApexWsRows.findByC014", query = "SELECT a FROM ApexWsRows a WHERE a.c014 = :c014"),
    @NamedQuery(name = "ApexWsRows.findByC015", query = "SELECT a FROM ApexWsRows a WHERE a.c015 = :c015"),
    @NamedQuery(name = "ApexWsRows.findByC016", query = "SELECT a FROM ApexWsRows a WHERE a.c016 = :c016"),
    @NamedQuery(name = "ApexWsRows.findByC017", query = "SELECT a FROM ApexWsRows a WHERE a.c017 = :c017"),
    @NamedQuery(name = "ApexWsRows.findByC018", query = "SELECT a FROM ApexWsRows a WHERE a.c018 = :c018"),
    @NamedQuery(name = "ApexWsRows.findByC019", query = "SELECT a FROM ApexWsRows a WHERE a.c019 = :c019"),
    @NamedQuery(name = "ApexWsRows.findByC020", query = "SELECT a FROM ApexWsRows a WHERE a.c020 = :c020"),
    @NamedQuery(name = "ApexWsRows.findByC021", query = "SELECT a FROM ApexWsRows a WHERE a.c021 = :c021"),
    @NamedQuery(name = "ApexWsRows.findByC022", query = "SELECT a FROM ApexWsRows a WHERE a.c022 = :c022"),
    @NamedQuery(name = "ApexWsRows.findByC023", query = "SELECT a FROM ApexWsRows a WHERE a.c023 = :c023"),
    @NamedQuery(name = "ApexWsRows.findByC024", query = "SELECT a FROM ApexWsRows a WHERE a.c024 = :c024"),
    @NamedQuery(name = "ApexWsRows.findByC025", query = "SELECT a FROM ApexWsRows a WHERE a.c025 = :c025"),
    @NamedQuery(name = "ApexWsRows.findByC026", query = "SELECT a FROM ApexWsRows a WHERE a.c026 = :c026"),
    @NamedQuery(name = "ApexWsRows.findByC027", query = "SELECT a FROM ApexWsRows a WHERE a.c027 = :c027"),
    @NamedQuery(name = "ApexWsRows.findByC028", query = "SELECT a FROM ApexWsRows a WHERE a.c028 = :c028"),
    @NamedQuery(name = "ApexWsRows.findByC029", query = "SELECT a FROM ApexWsRows a WHERE a.c029 = :c029"),
    @NamedQuery(name = "ApexWsRows.findByC030", query = "SELECT a FROM ApexWsRows a WHERE a.c030 = :c030"),
    @NamedQuery(name = "ApexWsRows.findByC031", query = "SELECT a FROM ApexWsRows a WHERE a.c031 = :c031"),
    @NamedQuery(name = "ApexWsRows.findByC032", query = "SELECT a FROM ApexWsRows a WHERE a.c032 = :c032"),
    @NamedQuery(name = "ApexWsRows.findByC033", query = "SELECT a FROM ApexWsRows a WHERE a.c033 = :c033"),
    @NamedQuery(name = "ApexWsRows.findByC034", query = "SELECT a FROM ApexWsRows a WHERE a.c034 = :c034"),
    @NamedQuery(name = "ApexWsRows.findByC035", query = "SELECT a FROM ApexWsRows a WHERE a.c035 = :c035"),
    @NamedQuery(name = "ApexWsRows.findByC036", query = "SELECT a FROM ApexWsRows a WHERE a.c036 = :c036"),
    @NamedQuery(name = "ApexWsRows.findByC037", query = "SELECT a FROM ApexWsRows a WHERE a.c037 = :c037"),
    @NamedQuery(name = "ApexWsRows.findByC038", query = "SELECT a FROM ApexWsRows a WHERE a.c038 = :c038"),
    @NamedQuery(name = "ApexWsRows.findByC039", query = "SELECT a FROM ApexWsRows a WHERE a.c039 = :c039"),
    @NamedQuery(name = "ApexWsRows.findByC040", query = "SELECT a FROM ApexWsRows a WHERE a.c040 = :c040"),
    @NamedQuery(name = "ApexWsRows.findByC041", query = "SELECT a FROM ApexWsRows a WHERE a.c041 = :c041"),
    @NamedQuery(name = "ApexWsRows.findByC042", query = "SELECT a FROM ApexWsRows a WHERE a.c042 = :c042"),
    @NamedQuery(name = "ApexWsRows.findByC043", query = "SELECT a FROM ApexWsRows a WHERE a.c043 = :c043"),
    @NamedQuery(name = "ApexWsRows.findByC044", query = "SELECT a FROM ApexWsRows a WHERE a.c044 = :c044"),
    @NamedQuery(name = "ApexWsRows.findByC045", query = "SELECT a FROM ApexWsRows a WHERE a.c045 = :c045"),
    @NamedQuery(name = "ApexWsRows.findByC046", query = "SELECT a FROM ApexWsRows a WHERE a.c046 = :c046"),
    @NamedQuery(name = "ApexWsRows.findByC047", query = "SELECT a FROM ApexWsRows a WHERE a.c047 = :c047"),
    @NamedQuery(name = "ApexWsRows.findByC048", query = "SELECT a FROM ApexWsRows a WHERE a.c048 = :c048"),
    @NamedQuery(name = "ApexWsRows.findByC049", query = "SELECT a FROM ApexWsRows a WHERE a.c049 = :c049"),
    @NamedQuery(name = "ApexWsRows.findByC050", query = "SELECT a FROM ApexWsRows a WHERE a.c050 = :c050"),
    @NamedQuery(name = "ApexWsRows.findByN001", query = "SELECT a FROM ApexWsRows a WHERE a.n001 = :n001"),
    @NamedQuery(name = "ApexWsRows.findByN002", query = "SELECT a FROM ApexWsRows a WHERE a.n002 = :n002"),
    @NamedQuery(name = "ApexWsRows.findByN003", query = "SELECT a FROM ApexWsRows a WHERE a.n003 = :n003"),
    @NamedQuery(name = "ApexWsRows.findByN004", query = "SELECT a FROM ApexWsRows a WHERE a.n004 = :n004"),
    @NamedQuery(name = "ApexWsRows.findByN005", query = "SELECT a FROM ApexWsRows a WHERE a.n005 = :n005"),
    @NamedQuery(name = "ApexWsRows.findByN006", query = "SELECT a FROM ApexWsRows a WHERE a.n006 = :n006"),
    @NamedQuery(name = "ApexWsRows.findByN007", query = "SELECT a FROM ApexWsRows a WHERE a.n007 = :n007"),
    @NamedQuery(name = "ApexWsRows.findByN008", query = "SELECT a FROM ApexWsRows a WHERE a.n008 = :n008"),
    @NamedQuery(name = "ApexWsRows.findByN009", query = "SELECT a FROM ApexWsRows a WHERE a.n009 = :n009"),
    @NamedQuery(name = "ApexWsRows.findByN010", query = "SELECT a FROM ApexWsRows a WHERE a.n010 = :n010"),
    @NamedQuery(name = "ApexWsRows.findByN011", query = "SELECT a FROM ApexWsRows a WHERE a.n011 = :n011"),
    @NamedQuery(name = "ApexWsRows.findByN012", query = "SELECT a FROM ApexWsRows a WHERE a.n012 = :n012"),
    @NamedQuery(name = "ApexWsRows.findByN013", query = "SELECT a FROM ApexWsRows a WHERE a.n013 = :n013"),
    @NamedQuery(name = "ApexWsRows.findByN014", query = "SELECT a FROM ApexWsRows a WHERE a.n014 = :n014"),
    @NamedQuery(name = "ApexWsRows.findByN015", query = "SELECT a FROM ApexWsRows a WHERE a.n015 = :n015"),
    @NamedQuery(name = "ApexWsRows.findByN016", query = "SELECT a FROM ApexWsRows a WHERE a.n016 = :n016"),
    @NamedQuery(name = "ApexWsRows.findByN017", query = "SELECT a FROM ApexWsRows a WHERE a.n017 = :n017"),
    @NamedQuery(name = "ApexWsRows.findByN018", query = "SELECT a FROM ApexWsRows a WHERE a.n018 = :n018"),
    @NamedQuery(name = "ApexWsRows.findByN019", query = "SELECT a FROM ApexWsRows a WHERE a.n019 = :n019"),
    @NamedQuery(name = "ApexWsRows.findByN020", query = "SELECT a FROM ApexWsRows a WHERE a.n020 = :n020"),
    @NamedQuery(name = "ApexWsRows.findByN021", query = "SELECT a FROM ApexWsRows a WHERE a.n021 = :n021"),
    @NamedQuery(name = "ApexWsRows.findByN022", query = "SELECT a FROM ApexWsRows a WHERE a.n022 = :n022"),
    @NamedQuery(name = "ApexWsRows.findByN023", query = "SELECT a FROM ApexWsRows a WHERE a.n023 = :n023"),
    @NamedQuery(name = "ApexWsRows.findByN024", query = "SELECT a FROM ApexWsRows a WHERE a.n024 = :n024"),
    @NamedQuery(name = "ApexWsRows.findByN025", query = "SELECT a FROM ApexWsRows a WHERE a.n025 = :n025"),
    @NamedQuery(name = "ApexWsRows.findByN026", query = "SELECT a FROM ApexWsRows a WHERE a.n026 = :n026"),
    @NamedQuery(name = "ApexWsRows.findByN027", query = "SELECT a FROM ApexWsRows a WHERE a.n027 = :n027"),
    @NamedQuery(name = "ApexWsRows.findByN028", query = "SELECT a FROM ApexWsRows a WHERE a.n028 = :n028"),
    @NamedQuery(name = "ApexWsRows.findByN029", query = "SELECT a FROM ApexWsRows a WHERE a.n029 = :n029"),
    @NamedQuery(name = "ApexWsRows.findByN030", query = "SELECT a FROM ApexWsRows a WHERE a.n030 = :n030"),
    @NamedQuery(name = "ApexWsRows.findByN031", query = "SELECT a FROM ApexWsRows a WHERE a.n031 = :n031"),
    @NamedQuery(name = "ApexWsRows.findByN032", query = "SELECT a FROM ApexWsRows a WHERE a.n032 = :n032"),
    @NamedQuery(name = "ApexWsRows.findByN033", query = "SELECT a FROM ApexWsRows a WHERE a.n033 = :n033"),
    @NamedQuery(name = "ApexWsRows.findByN034", query = "SELECT a FROM ApexWsRows a WHERE a.n034 = :n034"),
    @NamedQuery(name = "ApexWsRows.findByN035", query = "SELECT a FROM ApexWsRows a WHERE a.n035 = :n035"),
    @NamedQuery(name = "ApexWsRows.findByN036", query = "SELECT a FROM ApexWsRows a WHERE a.n036 = :n036"),
    @NamedQuery(name = "ApexWsRows.findByN037", query = "SELECT a FROM ApexWsRows a WHERE a.n037 = :n037"),
    @NamedQuery(name = "ApexWsRows.findByN038", query = "SELECT a FROM ApexWsRows a WHERE a.n038 = :n038"),
    @NamedQuery(name = "ApexWsRows.findByN039", query = "SELECT a FROM ApexWsRows a WHERE a.n039 = :n039"),
    @NamedQuery(name = "ApexWsRows.findByN040", query = "SELECT a FROM ApexWsRows a WHERE a.n040 = :n040"),
    @NamedQuery(name = "ApexWsRows.findByN041", query = "SELECT a FROM ApexWsRows a WHERE a.n041 = :n041"),
    @NamedQuery(name = "ApexWsRows.findByN042", query = "SELECT a FROM ApexWsRows a WHERE a.n042 = :n042"),
    @NamedQuery(name = "ApexWsRows.findByN043", query = "SELECT a FROM ApexWsRows a WHERE a.n043 = :n043"),
    @NamedQuery(name = "ApexWsRows.findByN044", query = "SELECT a FROM ApexWsRows a WHERE a.n044 = :n044"),
    @NamedQuery(name = "ApexWsRows.findByN045", query = "SELECT a FROM ApexWsRows a WHERE a.n045 = :n045"),
    @NamedQuery(name = "ApexWsRows.findByN046", query = "SELECT a FROM ApexWsRows a WHERE a.n046 = :n046"),
    @NamedQuery(name = "ApexWsRows.findByN047", query = "SELECT a FROM ApexWsRows a WHERE a.n047 = :n047"),
    @NamedQuery(name = "ApexWsRows.findByN048", query = "SELECT a FROM ApexWsRows a WHERE a.n048 = :n048"),
    @NamedQuery(name = "ApexWsRows.findByN049", query = "SELECT a FROM ApexWsRows a WHERE a.n049 = :n049"),
    @NamedQuery(name = "ApexWsRows.findByN050", query = "SELECT a FROM ApexWsRows a WHERE a.n050 = :n050"),
    @NamedQuery(name = "ApexWsRows.findByD001", query = "SELECT a FROM ApexWsRows a WHERE a.d001 = :d001"),
    @NamedQuery(name = "ApexWsRows.findByD002", query = "SELECT a FROM ApexWsRows a WHERE a.d002 = :d002"),
    @NamedQuery(name = "ApexWsRows.findByD003", query = "SELECT a FROM ApexWsRows a WHERE a.d003 = :d003"),
    @NamedQuery(name = "ApexWsRows.findByD004", query = "SELECT a FROM ApexWsRows a WHERE a.d004 = :d004"),
    @NamedQuery(name = "ApexWsRows.findByD005", query = "SELECT a FROM ApexWsRows a WHERE a.d005 = :d005"),
    @NamedQuery(name = "ApexWsRows.findByD006", query = "SELECT a FROM ApexWsRows a WHERE a.d006 = :d006"),
    @NamedQuery(name = "ApexWsRows.findByD007", query = "SELECT a FROM ApexWsRows a WHERE a.d007 = :d007"),
    @NamedQuery(name = "ApexWsRows.findByD008", query = "SELECT a FROM ApexWsRows a WHERE a.d008 = :d008"),
    @NamedQuery(name = "ApexWsRows.findByD009", query = "SELECT a FROM ApexWsRows a WHERE a.d009 = :d009"),
    @NamedQuery(name = "ApexWsRows.findByD010", query = "SELECT a FROM ApexWsRows a WHERE a.d010 = :d010"),
    @NamedQuery(name = "ApexWsRows.findByD011", query = "SELECT a FROM ApexWsRows a WHERE a.d011 = :d011"),
    @NamedQuery(name = "ApexWsRows.findByD012", query = "SELECT a FROM ApexWsRows a WHERE a.d012 = :d012"),
    @NamedQuery(name = "ApexWsRows.findByD013", query = "SELECT a FROM ApexWsRows a WHERE a.d013 = :d013"),
    @NamedQuery(name = "ApexWsRows.findByD014", query = "SELECT a FROM ApexWsRows a WHERE a.d014 = :d014"),
    @NamedQuery(name = "ApexWsRows.findByD015", query = "SELECT a FROM ApexWsRows a WHERE a.d015 = :d015"),
    @NamedQuery(name = "ApexWsRows.findByD016", query = "SELECT a FROM ApexWsRows a WHERE a.d016 = :d016"),
    @NamedQuery(name = "ApexWsRows.findByD017", query = "SELECT a FROM ApexWsRows a WHERE a.d017 = :d017"),
    @NamedQuery(name = "ApexWsRows.findByD018", query = "SELECT a FROM ApexWsRows a WHERE a.d018 = :d018"),
    @NamedQuery(name = "ApexWsRows.findByD019", query = "SELECT a FROM ApexWsRows a WHERE a.d019 = :d019"),
    @NamedQuery(name = "ApexWsRows.findByD020", query = "SELECT a FROM ApexWsRows a WHERE a.d020 = :d020"),
    @NamedQuery(name = "ApexWsRows.findByD021", query = "SELECT a FROM ApexWsRows a WHERE a.d021 = :d021"),
    @NamedQuery(name = "ApexWsRows.findByD022", query = "SELECT a FROM ApexWsRows a WHERE a.d022 = :d022"),
    @NamedQuery(name = "ApexWsRows.findByD023", query = "SELECT a FROM ApexWsRows a WHERE a.d023 = :d023"),
    @NamedQuery(name = "ApexWsRows.findByD024", query = "SELECT a FROM ApexWsRows a WHERE a.d024 = :d024"),
    @NamedQuery(name = "ApexWsRows.findByD025", query = "SELECT a FROM ApexWsRows a WHERE a.d025 = :d025"),
    @NamedQuery(name = "ApexWsRows.findByD026", query = "SELECT a FROM ApexWsRows a WHERE a.d026 = :d026"),
    @NamedQuery(name = "ApexWsRows.findByD027", query = "SELECT a FROM ApexWsRows a WHERE a.d027 = :d027"),
    @NamedQuery(name = "ApexWsRows.findByD028", query = "SELECT a FROM ApexWsRows a WHERE a.d028 = :d028"),
    @NamedQuery(name = "ApexWsRows.findByD029", query = "SELECT a FROM ApexWsRows a WHERE a.d029 = :d029"),
    @NamedQuery(name = "ApexWsRows.findByD030", query = "SELECT a FROM ApexWsRows a WHERE a.d030 = :d030"),
    @NamedQuery(name = "ApexWsRows.findByD031", query = "SELECT a FROM ApexWsRows a WHERE a.d031 = :d031"),
    @NamedQuery(name = "ApexWsRows.findByD032", query = "SELECT a FROM ApexWsRows a WHERE a.d032 = :d032"),
    @NamedQuery(name = "ApexWsRows.findByD033", query = "SELECT a FROM ApexWsRows a WHERE a.d033 = :d033"),
    @NamedQuery(name = "ApexWsRows.findByD034", query = "SELECT a FROM ApexWsRows a WHERE a.d034 = :d034"),
    @NamedQuery(name = "ApexWsRows.findByD035", query = "SELECT a FROM ApexWsRows a WHERE a.d035 = :d035"),
    @NamedQuery(name = "ApexWsRows.findByD036", query = "SELECT a FROM ApexWsRows a WHERE a.d036 = :d036"),
    @NamedQuery(name = "ApexWsRows.findByD037", query = "SELECT a FROM ApexWsRows a WHERE a.d037 = :d037"),
    @NamedQuery(name = "ApexWsRows.findByD038", query = "SELECT a FROM ApexWsRows a WHERE a.d038 = :d038"),
    @NamedQuery(name = "ApexWsRows.findByD039", query = "SELECT a FROM ApexWsRows a WHERE a.d039 = :d039"),
    @NamedQuery(name = "ApexWsRows.findByD040", query = "SELECT a FROM ApexWsRows a WHERE a.d040 = :d040"),
    @NamedQuery(name = "ApexWsRows.findByD041", query = "SELECT a FROM ApexWsRows a WHERE a.d041 = :d041"),
    @NamedQuery(name = "ApexWsRows.findByD042", query = "SELECT a FROM ApexWsRows a WHERE a.d042 = :d042"),
    @NamedQuery(name = "ApexWsRows.findByD043", query = "SELECT a FROM ApexWsRows a WHERE a.d043 = :d043"),
    @NamedQuery(name = "ApexWsRows.findByD044", query = "SELECT a FROM ApexWsRows a WHERE a.d044 = :d044"),
    @NamedQuery(name = "ApexWsRows.findByD045", query = "SELECT a FROM ApexWsRows a WHERE a.d045 = :d045"),
    @NamedQuery(name = "ApexWsRows.findByD046", query = "SELECT a FROM ApexWsRows a WHERE a.d046 = :d046"),
    @NamedQuery(name = "ApexWsRows.findByD047", query = "SELECT a FROM ApexWsRows a WHERE a.d047 = :d047"),
    @NamedQuery(name = "ApexWsRows.findByD048", query = "SELECT a FROM ApexWsRows a WHERE a.d048 = :d048"),
    @NamedQuery(name = "ApexWsRows.findByD049", query = "SELECT a FROM ApexWsRows a WHERE a.d049 = :d049"),
    @NamedQuery(name = "ApexWsRows.findByD050", query = "SELECT a FROM ApexWsRows a WHERE a.d050 = :d050")})
public class ApexWsRows implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "WS_APP_ID")
    private BigInteger wsAppId;
    @Basic(optional = false)
    @Column(name = "DATA_GRID_ID")
    private BigInteger dataGridId;
    @Column(name = "UNIQUE_VALUE")
    private String uniqueValue;
    @Column(name = "TAGS")
    private String tags;
    @Column(name = "PARENT_ROW_ID")
    private BigInteger parentRowId;
    @Column(name = "OWNER")
    private String owner;
    @Column(name = "GEOCODE")
    private String geocode;
    @Column(name = "LOAD_ORDER")
    private BigInteger loadOrder;
    @Column(name = "CHANGE_COUNT")
    private BigInteger changeCount;
    @Basic(optional = false)
    @Column(name = "CREATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "C001")
    private String c001;
    @Column(name = "C002")
    private String c002;
    @Column(name = "C003")
    private String c003;
    @Column(name = "C004")
    private String c004;
    @Column(name = "C005")
    private String c005;
    @Column(name = "C006")
    private String c006;
    @Column(name = "C007")
    private String c007;
    @Column(name = "C008")
    private String c008;
    @Column(name = "C009")
    private String c009;
    @Column(name = "C010")
    private String c010;
    @Column(name = "C011")
    private String c011;
    @Column(name = "C012")
    private String c012;
    @Column(name = "C013")
    private String c013;
    @Column(name = "C014")
    private String c014;
    @Column(name = "C015")
    private String c015;
    @Column(name = "C016")
    private String c016;
    @Column(name = "C017")
    private String c017;
    @Column(name = "C018")
    private String c018;
    @Column(name = "C019")
    private String c019;
    @Column(name = "C020")
    private String c020;
    @Column(name = "C021")
    private String c021;
    @Column(name = "C022")
    private String c022;
    @Column(name = "C023")
    private String c023;
    @Column(name = "C024")
    private String c024;
    @Column(name = "C025")
    private String c025;
    @Column(name = "C026")
    private String c026;
    @Column(name = "C027")
    private String c027;
    @Column(name = "C028")
    private String c028;
    @Column(name = "C029")
    private String c029;
    @Column(name = "C030")
    private String c030;
    @Column(name = "C031")
    private String c031;
    @Column(name = "C032")
    private String c032;
    @Column(name = "C033")
    private String c033;
    @Column(name = "C034")
    private String c034;
    @Column(name = "C035")
    private String c035;
    @Column(name = "C036")
    private String c036;
    @Column(name = "C037")
    private String c037;
    @Column(name = "C038")
    private String c038;
    @Column(name = "C039")
    private String c039;
    @Column(name = "C040")
    private String c040;
    @Column(name = "C041")
    private String c041;
    @Column(name = "C042")
    private String c042;
    @Column(name = "C043")
    private String c043;
    @Column(name = "C044")
    private String c044;
    @Column(name = "C045")
    private String c045;
    @Column(name = "C046")
    private String c046;
    @Column(name = "C047")
    private String c047;
    @Column(name = "C048")
    private String c048;
    @Column(name = "C049")
    private String c049;
    @Column(name = "C050")
    private String c050;
    @Column(name = "N001")
    private BigInteger n001;
    @Column(name = "N002")
    private BigInteger n002;
    @Column(name = "N003")
    private BigInteger n003;
    @Column(name = "N004")
    private BigInteger n004;
    @Column(name = "N005")
    private BigInteger n005;
    @Column(name = "N006")
    private BigInteger n006;
    @Column(name = "N007")
    private BigInteger n007;
    @Column(name = "N008")
    private BigInteger n008;
    @Column(name = "N009")
    private BigInteger n009;
    @Column(name = "N010")
    private BigInteger n010;
    @Column(name = "N011")
    private BigInteger n011;
    @Column(name = "N012")
    private BigInteger n012;
    @Column(name = "N013")
    private BigInteger n013;
    @Column(name = "N014")
    private BigInteger n014;
    @Column(name = "N015")
    private BigInteger n015;
    @Column(name = "N016")
    private BigInteger n016;
    @Column(name = "N017")
    private BigInteger n017;
    @Column(name = "N018")
    private BigInteger n018;
    @Column(name = "N019")
    private BigInteger n019;
    @Column(name = "N020")
    private BigInteger n020;
    @Column(name = "N021")
    private BigInteger n021;
    @Column(name = "N022")
    private BigInteger n022;
    @Column(name = "N023")
    private BigInteger n023;
    @Column(name = "N024")
    private BigInteger n024;
    @Column(name = "N025")
    private BigInteger n025;
    @Column(name = "N026")
    private BigInteger n026;
    @Column(name = "N027")
    private BigInteger n027;
    @Column(name = "N028")
    private BigInteger n028;
    @Column(name = "N029")
    private BigInteger n029;
    @Column(name = "N030")
    private BigInteger n030;
    @Column(name = "N031")
    private BigInteger n031;
    @Column(name = "N032")
    private BigInteger n032;
    @Column(name = "N033")
    private BigInteger n033;
    @Column(name = "N034")
    private BigInteger n034;
    @Column(name = "N035")
    private BigInteger n035;
    @Column(name = "N036")
    private BigInteger n036;
    @Column(name = "N037")
    private BigInteger n037;
    @Column(name = "N038")
    private BigInteger n038;
    @Column(name = "N039")
    private BigInteger n039;
    @Column(name = "N040")
    private BigInteger n040;
    @Column(name = "N041")
    private BigInteger n041;
    @Column(name = "N042")
    private BigInteger n042;
    @Column(name = "N043")
    private BigInteger n043;
    @Column(name = "N044")
    private BigInteger n044;
    @Column(name = "N045")
    private BigInteger n045;
    @Column(name = "N046")
    private BigInteger n046;
    @Column(name = "N047")
    private BigInteger n047;
    @Column(name = "N048")
    private BigInteger n048;
    @Column(name = "N049")
    private BigInteger n049;
    @Column(name = "N050")
    private BigInteger n050;
    @Column(name = "D001")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d001;
    @Column(name = "D002")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d002;
    @Column(name = "D003")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d003;
    @Column(name = "D004")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d004;
    @Column(name = "D005")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d005;
    @Column(name = "D006")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d006;
    @Column(name = "D007")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d007;
    @Column(name = "D008")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d008;
    @Column(name = "D009")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d009;
    @Column(name = "D010")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d010;
    @Column(name = "D011")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d011;
    @Column(name = "D012")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d012;
    @Column(name = "D013")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d013;
    @Column(name = "D014")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d014;
    @Column(name = "D015")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d015;
    @Column(name = "D016")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d016;
    @Column(name = "D017")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d017;
    @Column(name = "D018")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d018;
    @Column(name = "D019")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d019;
    @Column(name = "D020")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d020;
    @Column(name = "D021")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d021;
    @Column(name = "D022")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d022;
    @Column(name = "D023")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d023;
    @Column(name = "D024")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d024;
    @Column(name = "D025")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d025;
    @Column(name = "D026")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d026;
    @Column(name = "D027")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d027;
    @Column(name = "D028")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d028;
    @Column(name = "D029")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d029;
    @Column(name = "D030")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d030;
    @Column(name = "D031")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d031;
    @Column(name = "D032")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d032;
    @Column(name = "D033")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d033;
    @Column(name = "D034")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d034;
    @Column(name = "D035")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d035;
    @Column(name = "D036")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d036;
    @Column(name = "D037")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d037;
    @Column(name = "D038")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d038;
    @Column(name = "D039")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d039;
    @Column(name = "D040")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d040;
    @Column(name = "D041")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d041;
    @Column(name = "D042")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d042;
    @Column(name = "D043")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d043;
    @Column(name = "D044")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d044;
    @Column(name = "D045")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d045;
    @Column(name = "D046")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d046;
    @Column(name = "D047")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d047;
    @Column(name = "D048")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d048;
    @Column(name = "D049")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d049;
    @Column(name = "D050")
    @Temporal(TemporalType.TIMESTAMP)
    private Date d050;
    @Lob
    @Column(name = "CLOB001")
    private String clob001;
    @Lob
    @Column(name = "SEARCH_CLOB")
    private String searchClob;
    @OneToMany(mappedBy = "rowId")
    private Collection<ApexWsLinks> apexWsLinksCollection;
    @OneToMany(mappedBy = "rowId")
    private Collection<ApexWsTags> apexWsTagsCollection;
    @OneToMany(mappedBy = "rowId")
    private Collection<ApexWsNotes> apexWsNotesCollection;
    @OneToMany(mappedBy = "rowId")
    private Collection<ApexWsFiles> apexWsFilesCollection;

    public ApexWsRows() {
    }

    public ApexWsRows(BigDecimal id) {
        this.id = id;
    }

    public ApexWsRows(BigDecimal id, BigInteger wsAppId, BigInteger dataGridId, Date createdOn, String createdBy) {
        this.id = id;
        this.wsAppId = wsAppId;
        this.dataGridId = dataGridId;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getWsAppId() {
        return wsAppId;
    }

    public void setWsAppId(BigInteger wsAppId) {
        this.wsAppId = wsAppId;
    }

    public BigInteger getDataGridId() {
        return dataGridId;
    }

    public void setDataGridId(BigInteger dataGridId) {
        this.dataGridId = dataGridId;
    }

    public String getUniqueValue() {
        return uniqueValue;
    }

    public void setUniqueValue(String uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public BigInteger getParentRowId() {
        return parentRowId;
    }

    public void setParentRowId(BigInteger parentRowId) {
        this.parentRowId = parentRowId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGeocode() {
        return geocode;
    }

    public void setGeocode(String geocode) {
        this.geocode = geocode;
    }

    public BigInteger getLoadOrder() {
        return loadOrder;
    }

    public void setLoadOrder(BigInteger loadOrder) {
        this.loadOrder = loadOrder;
    }

    public BigInteger getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(BigInteger changeCount) {
        this.changeCount = changeCount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getC001() {
        return c001;
    }

    public void setC001(String c001) {
        this.c001 = c001;
    }

    public String getC002() {
        return c002;
    }

    public void setC002(String c002) {
        this.c002 = c002;
    }

    public String getC003() {
        return c003;
    }

    public void setC003(String c003) {
        this.c003 = c003;
    }

    public String getC004() {
        return c004;
    }

    public void setC004(String c004) {
        this.c004 = c004;
    }

    public String getC005() {
        return c005;
    }

    public void setC005(String c005) {
        this.c005 = c005;
    }

    public String getC006() {
        return c006;
    }

    public void setC006(String c006) {
        this.c006 = c006;
    }

    public String getC007() {
        return c007;
    }

    public void setC007(String c007) {
        this.c007 = c007;
    }

    public String getC008() {
        return c008;
    }

    public void setC008(String c008) {
        this.c008 = c008;
    }

    public String getC009() {
        return c009;
    }

    public void setC009(String c009) {
        this.c009 = c009;
    }

    public String getC010() {
        return c010;
    }

    public void setC010(String c010) {
        this.c010 = c010;
    }

    public String getC011() {
        return c011;
    }

    public void setC011(String c011) {
        this.c011 = c011;
    }

    public String getC012() {
        return c012;
    }

    public void setC012(String c012) {
        this.c012 = c012;
    }

    public String getC013() {
        return c013;
    }

    public void setC013(String c013) {
        this.c013 = c013;
    }

    public String getC014() {
        return c014;
    }

    public void setC014(String c014) {
        this.c014 = c014;
    }

    public String getC015() {
        return c015;
    }

    public void setC015(String c015) {
        this.c015 = c015;
    }

    public String getC016() {
        return c016;
    }

    public void setC016(String c016) {
        this.c016 = c016;
    }

    public String getC017() {
        return c017;
    }

    public void setC017(String c017) {
        this.c017 = c017;
    }

    public String getC018() {
        return c018;
    }

    public void setC018(String c018) {
        this.c018 = c018;
    }

    public String getC019() {
        return c019;
    }

    public void setC019(String c019) {
        this.c019 = c019;
    }

    public String getC020() {
        return c020;
    }

    public void setC020(String c020) {
        this.c020 = c020;
    }

    public String getC021() {
        return c021;
    }

    public void setC021(String c021) {
        this.c021 = c021;
    }

    public String getC022() {
        return c022;
    }

    public void setC022(String c022) {
        this.c022 = c022;
    }

    public String getC023() {
        return c023;
    }

    public void setC023(String c023) {
        this.c023 = c023;
    }

    public String getC024() {
        return c024;
    }

    public void setC024(String c024) {
        this.c024 = c024;
    }

    public String getC025() {
        return c025;
    }

    public void setC025(String c025) {
        this.c025 = c025;
    }

    public String getC026() {
        return c026;
    }

    public void setC026(String c026) {
        this.c026 = c026;
    }

    public String getC027() {
        return c027;
    }

    public void setC027(String c027) {
        this.c027 = c027;
    }

    public String getC028() {
        return c028;
    }

    public void setC028(String c028) {
        this.c028 = c028;
    }

    public String getC029() {
        return c029;
    }

    public void setC029(String c029) {
        this.c029 = c029;
    }

    public String getC030() {
        return c030;
    }

    public void setC030(String c030) {
        this.c030 = c030;
    }

    public String getC031() {
        return c031;
    }

    public void setC031(String c031) {
        this.c031 = c031;
    }

    public String getC032() {
        return c032;
    }

    public void setC032(String c032) {
        this.c032 = c032;
    }

    public String getC033() {
        return c033;
    }

    public void setC033(String c033) {
        this.c033 = c033;
    }

    public String getC034() {
        return c034;
    }

    public void setC034(String c034) {
        this.c034 = c034;
    }

    public String getC035() {
        return c035;
    }

    public void setC035(String c035) {
        this.c035 = c035;
    }

    public String getC036() {
        return c036;
    }

    public void setC036(String c036) {
        this.c036 = c036;
    }

    public String getC037() {
        return c037;
    }

    public void setC037(String c037) {
        this.c037 = c037;
    }

    public String getC038() {
        return c038;
    }

    public void setC038(String c038) {
        this.c038 = c038;
    }

    public String getC039() {
        return c039;
    }

    public void setC039(String c039) {
        this.c039 = c039;
    }

    public String getC040() {
        return c040;
    }

    public void setC040(String c040) {
        this.c040 = c040;
    }

    public String getC041() {
        return c041;
    }

    public void setC041(String c041) {
        this.c041 = c041;
    }

    public String getC042() {
        return c042;
    }

    public void setC042(String c042) {
        this.c042 = c042;
    }

    public String getC043() {
        return c043;
    }

    public void setC043(String c043) {
        this.c043 = c043;
    }

    public String getC044() {
        return c044;
    }

    public void setC044(String c044) {
        this.c044 = c044;
    }

    public String getC045() {
        return c045;
    }

    public void setC045(String c045) {
        this.c045 = c045;
    }

    public String getC046() {
        return c046;
    }

    public void setC046(String c046) {
        this.c046 = c046;
    }

    public String getC047() {
        return c047;
    }

    public void setC047(String c047) {
        this.c047 = c047;
    }

    public String getC048() {
        return c048;
    }

    public void setC048(String c048) {
        this.c048 = c048;
    }

    public String getC049() {
        return c049;
    }

    public void setC049(String c049) {
        this.c049 = c049;
    }

    public String getC050() {
        return c050;
    }

    public void setC050(String c050) {
        this.c050 = c050;
    }

    public BigInteger getN001() {
        return n001;
    }

    public void setN001(BigInteger n001) {
        this.n001 = n001;
    }

    public BigInteger getN002() {
        return n002;
    }

    public void setN002(BigInteger n002) {
        this.n002 = n002;
    }

    public BigInteger getN003() {
        return n003;
    }

    public void setN003(BigInteger n003) {
        this.n003 = n003;
    }

    public BigInteger getN004() {
        return n004;
    }

    public void setN004(BigInteger n004) {
        this.n004 = n004;
    }

    public BigInteger getN005() {
        return n005;
    }

    public void setN005(BigInteger n005) {
        this.n005 = n005;
    }

    public BigInteger getN006() {
        return n006;
    }

    public void setN006(BigInteger n006) {
        this.n006 = n006;
    }

    public BigInteger getN007() {
        return n007;
    }

    public void setN007(BigInteger n007) {
        this.n007 = n007;
    }

    public BigInteger getN008() {
        return n008;
    }

    public void setN008(BigInteger n008) {
        this.n008 = n008;
    }

    public BigInteger getN009() {
        return n009;
    }

    public void setN009(BigInteger n009) {
        this.n009 = n009;
    }

    public BigInteger getN010() {
        return n010;
    }

    public void setN010(BigInteger n010) {
        this.n010 = n010;
    }

    public BigInteger getN011() {
        return n011;
    }

    public void setN011(BigInteger n011) {
        this.n011 = n011;
    }

    public BigInteger getN012() {
        return n012;
    }

    public void setN012(BigInteger n012) {
        this.n012 = n012;
    }

    public BigInteger getN013() {
        return n013;
    }

    public void setN013(BigInteger n013) {
        this.n013 = n013;
    }

    public BigInteger getN014() {
        return n014;
    }

    public void setN014(BigInteger n014) {
        this.n014 = n014;
    }

    public BigInteger getN015() {
        return n015;
    }

    public void setN015(BigInteger n015) {
        this.n015 = n015;
    }

    public BigInteger getN016() {
        return n016;
    }

    public void setN016(BigInteger n016) {
        this.n016 = n016;
    }

    public BigInteger getN017() {
        return n017;
    }

    public void setN017(BigInteger n017) {
        this.n017 = n017;
    }

    public BigInteger getN018() {
        return n018;
    }

    public void setN018(BigInteger n018) {
        this.n018 = n018;
    }

    public BigInteger getN019() {
        return n019;
    }

    public void setN019(BigInteger n019) {
        this.n019 = n019;
    }

    public BigInteger getN020() {
        return n020;
    }

    public void setN020(BigInteger n020) {
        this.n020 = n020;
    }

    public BigInteger getN021() {
        return n021;
    }

    public void setN021(BigInteger n021) {
        this.n021 = n021;
    }

    public BigInteger getN022() {
        return n022;
    }

    public void setN022(BigInteger n022) {
        this.n022 = n022;
    }

    public BigInteger getN023() {
        return n023;
    }

    public void setN023(BigInteger n023) {
        this.n023 = n023;
    }

    public BigInteger getN024() {
        return n024;
    }

    public void setN024(BigInteger n024) {
        this.n024 = n024;
    }

    public BigInteger getN025() {
        return n025;
    }

    public void setN025(BigInteger n025) {
        this.n025 = n025;
    }

    public BigInteger getN026() {
        return n026;
    }

    public void setN026(BigInteger n026) {
        this.n026 = n026;
    }

    public BigInteger getN027() {
        return n027;
    }

    public void setN027(BigInteger n027) {
        this.n027 = n027;
    }

    public BigInteger getN028() {
        return n028;
    }

    public void setN028(BigInteger n028) {
        this.n028 = n028;
    }

    public BigInteger getN029() {
        return n029;
    }

    public void setN029(BigInteger n029) {
        this.n029 = n029;
    }

    public BigInteger getN030() {
        return n030;
    }

    public void setN030(BigInteger n030) {
        this.n030 = n030;
    }

    public BigInteger getN031() {
        return n031;
    }

    public void setN031(BigInteger n031) {
        this.n031 = n031;
    }

    public BigInteger getN032() {
        return n032;
    }

    public void setN032(BigInteger n032) {
        this.n032 = n032;
    }

    public BigInteger getN033() {
        return n033;
    }

    public void setN033(BigInteger n033) {
        this.n033 = n033;
    }

    public BigInteger getN034() {
        return n034;
    }

    public void setN034(BigInteger n034) {
        this.n034 = n034;
    }

    public BigInteger getN035() {
        return n035;
    }

    public void setN035(BigInteger n035) {
        this.n035 = n035;
    }

    public BigInteger getN036() {
        return n036;
    }

    public void setN036(BigInteger n036) {
        this.n036 = n036;
    }

    public BigInteger getN037() {
        return n037;
    }

    public void setN037(BigInteger n037) {
        this.n037 = n037;
    }

    public BigInteger getN038() {
        return n038;
    }

    public void setN038(BigInteger n038) {
        this.n038 = n038;
    }

    public BigInteger getN039() {
        return n039;
    }

    public void setN039(BigInteger n039) {
        this.n039 = n039;
    }

    public BigInteger getN040() {
        return n040;
    }

    public void setN040(BigInteger n040) {
        this.n040 = n040;
    }

    public BigInteger getN041() {
        return n041;
    }

    public void setN041(BigInteger n041) {
        this.n041 = n041;
    }

    public BigInteger getN042() {
        return n042;
    }

    public void setN042(BigInteger n042) {
        this.n042 = n042;
    }

    public BigInteger getN043() {
        return n043;
    }

    public void setN043(BigInteger n043) {
        this.n043 = n043;
    }

    public BigInteger getN044() {
        return n044;
    }

    public void setN044(BigInteger n044) {
        this.n044 = n044;
    }

    public BigInteger getN045() {
        return n045;
    }

    public void setN045(BigInteger n045) {
        this.n045 = n045;
    }

    public BigInteger getN046() {
        return n046;
    }

    public void setN046(BigInteger n046) {
        this.n046 = n046;
    }

    public BigInteger getN047() {
        return n047;
    }

    public void setN047(BigInteger n047) {
        this.n047 = n047;
    }

    public BigInteger getN048() {
        return n048;
    }

    public void setN048(BigInteger n048) {
        this.n048 = n048;
    }

    public BigInteger getN049() {
        return n049;
    }

    public void setN049(BigInteger n049) {
        this.n049 = n049;
    }

    public BigInteger getN050() {
        return n050;
    }

    public void setN050(BigInteger n050) {
        this.n050 = n050;
    }

    public Date getD001() {
        return d001;
    }

    public void setD001(Date d001) {
        this.d001 = d001;
    }

    public Date getD002() {
        return d002;
    }

    public void setD002(Date d002) {
        this.d002 = d002;
    }

    public Date getD003() {
        return d003;
    }

    public void setD003(Date d003) {
        this.d003 = d003;
    }

    public Date getD004() {
        return d004;
    }

    public void setD004(Date d004) {
        this.d004 = d004;
    }

    public Date getD005() {
        return d005;
    }

    public void setD005(Date d005) {
        this.d005 = d005;
    }

    public Date getD006() {
        return d006;
    }

    public void setD006(Date d006) {
        this.d006 = d006;
    }

    public Date getD007() {
        return d007;
    }

    public void setD007(Date d007) {
        this.d007 = d007;
    }

    public Date getD008() {
        return d008;
    }

    public void setD008(Date d008) {
        this.d008 = d008;
    }

    public Date getD009() {
        return d009;
    }

    public void setD009(Date d009) {
        this.d009 = d009;
    }

    public Date getD010() {
        return d010;
    }

    public void setD010(Date d010) {
        this.d010 = d010;
    }

    public Date getD011() {
        return d011;
    }

    public void setD011(Date d011) {
        this.d011 = d011;
    }

    public Date getD012() {
        return d012;
    }

    public void setD012(Date d012) {
        this.d012 = d012;
    }

    public Date getD013() {
        return d013;
    }

    public void setD013(Date d013) {
        this.d013 = d013;
    }

    public Date getD014() {
        return d014;
    }

    public void setD014(Date d014) {
        this.d014 = d014;
    }

    public Date getD015() {
        return d015;
    }

    public void setD015(Date d015) {
        this.d015 = d015;
    }

    public Date getD016() {
        return d016;
    }

    public void setD016(Date d016) {
        this.d016 = d016;
    }

    public Date getD017() {
        return d017;
    }

    public void setD017(Date d017) {
        this.d017 = d017;
    }

    public Date getD018() {
        return d018;
    }

    public void setD018(Date d018) {
        this.d018 = d018;
    }

    public Date getD019() {
        return d019;
    }

    public void setD019(Date d019) {
        this.d019 = d019;
    }

    public Date getD020() {
        return d020;
    }

    public void setD020(Date d020) {
        this.d020 = d020;
    }

    public Date getD021() {
        return d021;
    }

    public void setD021(Date d021) {
        this.d021 = d021;
    }

    public Date getD022() {
        return d022;
    }

    public void setD022(Date d022) {
        this.d022 = d022;
    }

    public Date getD023() {
        return d023;
    }

    public void setD023(Date d023) {
        this.d023 = d023;
    }

    public Date getD024() {
        return d024;
    }

    public void setD024(Date d024) {
        this.d024 = d024;
    }

    public Date getD025() {
        return d025;
    }

    public void setD025(Date d025) {
        this.d025 = d025;
    }

    public Date getD026() {
        return d026;
    }

    public void setD026(Date d026) {
        this.d026 = d026;
    }

    public Date getD027() {
        return d027;
    }

    public void setD027(Date d027) {
        this.d027 = d027;
    }

    public Date getD028() {
        return d028;
    }

    public void setD028(Date d028) {
        this.d028 = d028;
    }

    public Date getD029() {
        return d029;
    }

    public void setD029(Date d029) {
        this.d029 = d029;
    }

    public Date getD030() {
        return d030;
    }

    public void setD030(Date d030) {
        this.d030 = d030;
    }

    public Date getD031() {
        return d031;
    }

    public void setD031(Date d031) {
        this.d031 = d031;
    }

    public Date getD032() {
        return d032;
    }

    public void setD032(Date d032) {
        this.d032 = d032;
    }

    public Date getD033() {
        return d033;
    }

    public void setD033(Date d033) {
        this.d033 = d033;
    }

    public Date getD034() {
        return d034;
    }

    public void setD034(Date d034) {
        this.d034 = d034;
    }

    public Date getD035() {
        return d035;
    }

    public void setD035(Date d035) {
        this.d035 = d035;
    }

    public Date getD036() {
        return d036;
    }

    public void setD036(Date d036) {
        this.d036 = d036;
    }

    public Date getD037() {
        return d037;
    }

    public void setD037(Date d037) {
        this.d037 = d037;
    }

    public Date getD038() {
        return d038;
    }

    public void setD038(Date d038) {
        this.d038 = d038;
    }

    public Date getD039() {
        return d039;
    }

    public void setD039(Date d039) {
        this.d039 = d039;
    }

    public Date getD040() {
        return d040;
    }

    public void setD040(Date d040) {
        this.d040 = d040;
    }

    public Date getD041() {
        return d041;
    }

    public void setD041(Date d041) {
        this.d041 = d041;
    }

    public Date getD042() {
        return d042;
    }

    public void setD042(Date d042) {
        this.d042 = d042;
    }

    public Date getD043() {
        return d043;
    }

    public void setD043(Date d043) {
        this.d043 = d043;
    }

    public Date getD044() {
        return d044;
    }

    public void setD044(Date d044) {
        this.d044 = d044;
    }

    public Date getD045() {
        return d045;
    }

    public void setD045(Date d045) {
        this.d045 = d045;
    }

    public Date getD046() {
        return d046;
    }

    public void setD046(Date d046) {
        this.d046 = d046;
    }

    public Date getD047() {
        return d047;
    }

    public void setD047(Date d047) {
        this.d047 = d047;
    }

    public Date getD048() {
        return d048;
    }

    public void setD048(Date d048) {
        this.d048 = d048;
    }

    public Date getD049() {
        return d049;
    }

    public void setD049(Date d049) {
        this.d049 = d049;
    }

    public Date getD050() {
        return d050;
    }

    public void setD050(Date d050) {
        this.d050 = d050;
    }

    public String getClob001() {
        return clob001;
    }

    public void setClob001(String clob001) {
        this.clob001 = clob001;
    }

    public String getSearchClob() {
        return searchClob;
    }

    public void setSearchClob(String searchClob) {
        this.searchClob = searchClob;
    }

    @XmlTransient
    public Collection<ApexWsLinks> getApexWsLinksCollection() {
        return apexWsLinksCollection;
    }

    public void setApexWsLinksCollection(Collection<ApexWsLinks> apexWsLinksCollection) {
        this.apexWsLinksCollection = apexWsLinksCollection;
    }

    @XmlTransient
    public Collection<ApexWsTags> getApexWsTagsCollection() {
        return apexWsTagsCollection;
    }

    public void setApexWsTagsCollection(Collection<ApexWsTags> apexWsTagsCollection) {
        this.apexWsTagsCollection = apexWsTagsCollection;
    }

    @XmlTransient
    public Collection<ApexWsNotes> getApexWsNotesCollection() {
        return apexWsNotesCollection;
    }

    public void setApexWsNotesCollection(Collection<ApexWsNotes> apexWsNotesCollection) {
        this.apexWsNotesCollection = apexWsNotesCollection;
    }

    @XmlTransient
    public Collection<ApexWsFiles> getApexWsFilesCollection() {
        return apexWsFilesCollection;
    }

    public void setApexWsFilesCollection(Collection<ApexWsFiles> apexWsFilesCollection) {
        this.apexWsFilesCollection = apexWsFilesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApexWsRows)) {
            return false;
        }
        ApexWsRows other = (ApexWsRows) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ApexWsRows[ id=" + id + " ]";
    }
    
}
