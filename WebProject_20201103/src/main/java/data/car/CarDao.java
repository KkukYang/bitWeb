package data.car;

import mybatis.setting.ConnectionManager;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class CarDao {
    ConnectionManager manager = ConnectionManager.getInstance();
    SqlSession session;

    private SqlSession getSession() {
        session = manager.openSession();
        return session;
    }

    ///////////////////////////////////////////////////////////////
    //전체 갯수.
    public int getTotalCount() {
        int n = 0;
        session = this.getSession();

        //car. 생략가능.
        n = session.selectOne("car.totalCountOfCar");
        session.close();
        return n;
    }

    public void insertCar(CarDto dto) {
        session = this.getSession();
        session.insert("car.insertOfCar", dto);
        session.close();
    }

    public List<CarDto> getAllDatas() {
        List<CarDto> list = null;
        session = this.getSession();
        list = session.selectList("car.selectAllOfCar");
        session.close();
        return list;
    }

    public CarDto getData(String num) {
        CarDto dto = null;
        session = this.getSession();
        dto = session.selectOne("car.selectOneOfCar", num);
        session.close();
        return dto;
    }

    public void updateData(CarDto dto) {
        session = this.getSession();
        session.update("updateOfCar", dto);
        session.close();
    }

    public void deleteCar(String num){
        session = this.getSession();
        session.delete("deleteOfCar", num);
        session.close();
    }
}
