package dayLecture.day0924;

import java.sql.Timestamp;

/*
 * create table student(
        	num number(5) constraint pk_stu_num primary key,
        	name varchar2(30),
        	photo varchar2(100),
        	hp varchar2(20),
        	addr varchar2(100),
        	birthyear number(4),
        	writeday date
	);
*/
public class StudentDto {
    private String num;
    private String name;
    private String photo;
    private String hp;
    private String addr;
    private int birthyear;
    private Timestamp writeday;

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public Timestamp getWriteday() {
        return writeday;
    }

    public void setWriteday(Timestamp writeday) {
        this.writeday = writeday;
    }


}
