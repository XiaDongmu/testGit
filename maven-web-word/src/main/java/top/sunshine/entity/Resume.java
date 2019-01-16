package top.sunshine.entity;

public class Resume {
	private String webSite;//姓名
    private String createDate1;//性别
    private String webName;//出生日期
    private String JCSJ;//照片
    private String EVENTNUM;//籍贯
    private String LEAKNUM;//民族
    private String HIGHNUM ;//身体状况
    private String MIDDLENUM;//毕业学校
    private String LOWNUM;//政治面貌
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getCreateDate1() {
		return createDate1;
	}
	public void setCreateDate1(String createDate1) {
		this.createDate1 = createDate1;
	}
	public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public String getJCSJ() {
		return JCSJ;
	}
	public void setJCSJ(String jCSJ) {
		JCSJ = jCSJ;
	}
	public String getEVENTNUM() {
		return EVENTNUM;
	}
	public void setEVENTNUM(String eVENTNUM) {
		EVENTNUM = eVENTNUM;
	}
	public String getLEAKNUM() {
		return LEAKNUM;
	}
	public void setLEAKNUM(String lEAKNUM) {
		LEAKNUM = lEAKNUM;
	}
	public String getHIGHNUM() {
		return HIGHNUM;
	}
	public void setHIGHNUM(String hIGHNUM) {
		HIGHNUM = hIGHNUM;
	}
	public String getMIDDLENUM() {
		return MIDDLENUM;
	}
	public void setMIDDLENUM(String mIDDLENUM) {
		MIDDLENUM = mIDDLENUM;
	}
	public String getLOWNUM() {
		return LOWNUM;
	}
	public void setLOWNUM(String lOWNUM) {
		LOWNUM = lOWNUM;
	}
	public Resume(String webSite, String createDate1, String webName, String jCSJ, String eVENTNUM, String lEAKNUM,
			String hIGHNUM, String mIDDLENUM, String lOWNUM) {
		super();
		this.webSite = webSite;
		this.createDate1 = createDate1;
		this.webName = webName;
		JCSJ = jCSJ;
		EVENTNUM = eVENTNUM;
		LEAKNUM = lEAKNUM;
		HIGHNUM = hIGHNUM;
		MIDDLENUM = mIDDLENUM;
		LOWNUM = lOWNUM;
	}
    


}
