package DAO.geo;

import DAO.hibernate.HibernateConnector;
import entity.geo.Country;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class CountryDao {
    public List<Country> getList(){
        Session session = null;
        try{
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from Country s");
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (List<Country>) queryList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

}
