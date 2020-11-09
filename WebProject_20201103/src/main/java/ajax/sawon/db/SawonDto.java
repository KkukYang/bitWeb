package ajax.sawon.db;

/*
create table sawon (
    num number(5) primary key,
    name varchar2(20),
    driver varchar2(30),
    gender varchar2(20),
    address varchar2(30),
    birthday varchar2(30)
);
* */
public class SawonDto {
    private String num;
    private String name;
    private String driver;
    private String gender;
    private String address;
    private String birthday;

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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
