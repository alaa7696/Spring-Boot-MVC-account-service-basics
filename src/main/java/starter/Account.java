package starter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private String id;
    private double solde;
    private double in;
    private double out;

    public Account() {

    }

    public Account(String id, double solde, double in, double out) {

        super();
        this.id=id;
        this.solde = solde;
        this.in = in;
        this.out = out;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getIn() {
        return in;
    }

    public void setIn(double in) {
        this.in = in;
    }

    public double getOut() {
        return out;
    }

    public void setOut(double out) {
        this.out = out;
    }



}
