import java.sql.Date;

public class Info {
	private String transtype;
	private int id;
	private int accnum;
	private int transamt;
	private Date transdate;
	private int accbalance;
	public String getTranstype() {
		return transtype;
	}
	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public int getTransamt() {
		return transamt;
	}
	public void setTransamt(int transamt) {
		this.transamt = transamt;
	}
	public Date getTransdate() {
		return transdate;
	}
	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}
	public int getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(int accbalance) {
		this.accbalance = accbalance;
	}
	}
	