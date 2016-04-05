package DAO.user;

import DAO.hibernate.HibernateConnector;
import entity.user.Role;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

public class RoleDao {
    public void addRole(Role role) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from Role s where s.name=:name OR s.id = :id");
            query.setParameter("name", role.getName());
            query.setParameter("id", role.getId());
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                session = HibernateConnector.getInstance().getSession();
                transaction = session.beginTransaction();
                session.save(role);
                transaction.commit();
            }
            else{
                System.out.println("This role has already");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public List<Role> getList() {
        Session session = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from Role s");
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
//                System.out.println("list " + queryList);
                return (List<Role>) queryList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }


    public Role findRoleById(int id) throws SQLException {
        Session session = null;
        Role role = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from Role s where s.id = :id");
            query.setParameter("id", id);
            List queryList = query.list();
            role = (Role) session.load(Role.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return role;
    }
}
