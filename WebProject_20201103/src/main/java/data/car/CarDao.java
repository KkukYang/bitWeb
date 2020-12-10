package data.car;

import mybatis.setting.ConnectionManager;
import org.apache.ibatis.session.SqlSession;


public class CarDao {
    ConnectionManager manager = ConnectionManager.getInstance();
    SqlSession session;

    private SqlSession getSession(){
        session = manager.openSession();
        return session;
    }
    ///////////////////////////////////////////////////////////////
    //전체 갯수.
    public int getTotalCount(){
        int n = 0;
        session = this.getSession();

        //car. 생략가능.
        n = session.selectOne("car.totalCountOfCar");

        session.close();
        return n;
    }
}
