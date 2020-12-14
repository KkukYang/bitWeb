package data.member;

/**
 * create table carmember
 * (
 * num     smallint primary key auto_increment,
 * name    varchar(20),
 * hp      varchar(20),
 * addr    varchar(30),
 * gaipday datetime
 * );
 */
public class MemberDto {
    private String num;
    private String name;
    private String hp;
    private String addr;
    private String gaipday;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getGaipday() {
        return gaipday;
    }

    public void setGaipday(String gaipday) {
        this.gaipday = gaipday;
    }
}
