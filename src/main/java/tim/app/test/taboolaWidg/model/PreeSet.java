package tim.app.test.taboolaWidg.model;

import javax.persistence.*;

@Entity
public class PreeSet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private TabooCard tbc1;
    @OneToOne
    private TabooCard tbc2;
    @OneToOne
    private TabooCard tbc3;
    @OneToOne
    private TabooCard tbc4;
    @OneToOne
    private TabooCard tbc5;
    @OneToOne
    private TabooCard tbc6;

    public PreeSet() {
    }

    public PreeSet(TabooCard tbc1, TabooCard tbc2, TabooCard tbc3, TabooCard tbc4, TabooCard tbc5, TabooCard tbc6) {
        this.tbc1 = tbc1;
        this.tbc2 = tbc2;
        this.tbc3 = tbc3;
        this.tbc4 = tbc4;
        this.tbc5 = tbc5;
        this.tbc6 = tbc6;
    }

    public PreeSet(Long id, TabooCard tbc1, TabooCard tbc2, TabooCard tbc3, TabooCard tbc4, TabooCard tbc5, TabooCard tbc6) {
        this.id = id;
        this.tbc1 = tbc1;
        this.tbc2 = tbc2;
        this.tbc3 = tbc3;
        this.tbc4 = tbc4;
        this.tbc5 = tbc5;
        this.tbc6 = tbc6;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TabooCard getTbc1() {
        return tbc1;
    }

    public void setTbc1(TabooCard tbc1) {
        this.tbc1 = tbc1;
    }

    public TabooCard getTbc2() {
        return tbc2;
    }

    public void setTbc2(TabooCard tbc2) {
        this.tbc2 = tbc2;
    }

    public TabooCard getTbc3() {
        return tbc3;
    }

    public void setTbc3(TabooCard tbc3) {
        this.tbc3 = tbc3;
    }

    public TabooCard getTbc4() {
        return tbc4;
    }

    public void setTbc4(TabooCard tbc4) {
        this.tbc4 = tbc4;
    }

    public TabooCard getTbc5() {
        return tbc5;
    }

    public void setTbc5(TabooCard tbc5) {
        this.tbc5 = tbc5;
    }

    public TabooCard getTbc6() {
        return tbc6;
    }

    public void setTbc6(TabooCard tbc6) {
        this.tbc6 = tbc6;
    }

}
