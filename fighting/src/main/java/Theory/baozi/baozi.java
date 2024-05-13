package Theory.baozi;

public class baozi {
    private String pi;
    private String xina;
    private Boolean status;

    public baozi(String pi, String xina) {
        this.pi = pi;
        this.xina = xina;
        status = false;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXina() {
        return xina;
    }

    public void setXina(String xina) {
        this.xina = xina;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public baozi() {

        status =false;
    }
}
