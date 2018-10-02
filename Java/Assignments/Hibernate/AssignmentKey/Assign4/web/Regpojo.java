package web;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Regpojo implements Serializable {
    int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private String uname;
    private String pwd;
    
    public Regpojo() {
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}