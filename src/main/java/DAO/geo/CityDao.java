package DAO.geo;

import DAO.hibernate.HibernateConnector;
import entity.geo.City;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class CityDao {
    public List<City> getList(){
        Session session = null;
        try{
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from City s");
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (List<City>) queryList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    public List<City> getListById(int id){
        Session session = null;
        try{
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from City s where s.id = :id");
            query.setParameter("id",id);
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (List<City>) queryList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    public List<City> getListByCode(String code){
        Session session = null;
        try{
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from City s where s.country.code = :id");
            query.setParameter("id",code);
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (List<City>) queryList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    public City getItemByName(String name){
        Session session = null;
        try{
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from City s where s.name like :name");
            query.setParameter("name",name);
//            List queryList = query.list();
            if (query != null) {
                return null;
            } else {
                return (City) query;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
}
