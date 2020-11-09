package ajax.memo.db;

import java.sql.Timestamp;

/*create table memo(
        num number(5) primary key,
        nickname varchar2(30),
        content varchar2(200),
        avata varchar2(20),
        likes number(3) default 0,
        writeday date
        );*/
public class MemoDto {
    private String num;
    private String nickname;
    private String content;
    private String avata;
    private int likes;
    private Timestamp writeday;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvata() {
        return avata;
    }

    public void setAvata(String avata) {
        this.avata = avata;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Timestamp getWriteday() {
        return writeday;
    }

    public void setWriteday(Timestamp writeday) {
        this.writeday = writeday;
    }
}
