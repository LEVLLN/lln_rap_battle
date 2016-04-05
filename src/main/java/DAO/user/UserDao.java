package DAO.user;

import DAO.hibernate.HibernateConnector;
import entity.user.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {
    public void addUser(User user) {
        Session session = null;
        try{
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from User s where s.nickname=:user_nickname OR s.uuid = :uuid");
            query.setParameter("user_nickname",user.getNickname());
            query.setParameter("uuid",user.getUuid());
            List queryList = query.list();
            Transaction transaction = null;
            if (queryList != null && queryList.isEmpty()) {
                session = HibernateConnector.getInstance().getSession();
                transaction = session.beginTransaction();
                session.save(user);
                transaction.commit();
            } else {
//                System.out.println("list " + queryList);
                System.out.println("This user has already");
            }
            session.close();}
       catch (Exception e) {
          //  e.printStackTrace();
           if (e.toString().contains("'email' cannot be null")){
               System.out.println("Enter the email");
           }

        }
    }
    public boolean validate(User user){
      boolean status=false;
        Session session = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from User s where (s.nickname=:nickname OR s.email=:email)AND s.password=:password");
            query.setParameter("nickname",user.getNickname())
                    .setParameter("password",user.getPassword())
                    .setParameter("email",user.getEmail());
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                status=false;
            } else {
//                System.out.println("list " + queryList);
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
        return status;
    }
}
