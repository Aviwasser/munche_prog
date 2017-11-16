package arye;

public class wifi {
	private static final Exception Exception = null;
	String ID;
	String mac;
	String lat;
	String lon;
	String alt;
	String ssid;
	String time;
	String rxl;
	String channel;
	boolean usage=true;
	public boolean isUsage() {
		return usage;
	}
	public void setUsage(boolean usage) {
		this.usage = usage;
	}
	public wifi(){
	}
	public String getRxl() {
		return rxl;
	}
	public void setRxl(String rxl) {
		this.rxl = rxl;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void check(){
		try{
			//time
			String[] Checker=this.time.split("-");
			Integer.parseInt(Checker[0]);
			if(Integer.parseInt(Checker[1])>12||Integer.parseInt(Checker[1])<1){
				throw Exception;
			}
			Checker=Checker[2].split(" ");
			if(Integer.parseInt(Checker[0])>31||Integer.parseInt(Checker[0])<1){
				throw Exception;
			}
			Checker=Checker[1].split(":");
			if(Integer.parseInt(Checker[0])>23||Integer.parseInt(Checker[0])<0){
				throw Exception;
			}
			if(Integer.parseInt(Checker[1])>59||Integer.parseInt(Checker[1])<0){
				throw Exception;
			}
			if(Integer.parseInt(Checker[1])>59||Integer.parseInt(Checker[1])<0){
				throw Exception;
			}
			//coordination
			Double.parseDouble(this.lat);
			Double.parseDouble(this.alt);
			Double.parseDouble(this.lon);
			//channel&rxl
			Integer.parseInt(this.channel);
			Integer.parseInt(this.rxl);
			this.usage= true&&this.usage;
		}
		catch(Exception e){
			this.usage= false;
		}
	}
}
