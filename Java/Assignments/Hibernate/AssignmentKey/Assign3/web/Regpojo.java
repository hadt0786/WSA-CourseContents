package web;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Regpojo implements Serializable {
    @Id
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