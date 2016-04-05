import DAO.geo.CityDao;
import DAO.geo.CountryDao;
import DAO.user.RoleDao;
import DAO.user.UserDao;
import entity.Validator;
import entity.geo.City;
import entity.geo.Country;
import entity.user.Role;
import entity.user.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws SQLException {
//        Role role = new Role();
//        role.setName("admin");
        City city = null;
        Role role = null;
        RoleDao roleDao = new RoleDao();
        List<Role> roleList = roleDao.getList();
        for (Role r : roleList) {
            System.out.println(r.getName());
            if (r.getName().equals("admin")){
                role = r;
            }
        }
        CityDao cityDao = new CityDao();
        CountryDao countryDao = new CountryDao();

        for (Country ctr : countryDao.getList()) {
            System.out.println(ctr.getName());

        }
        for(City ct : cityDao.getListByCode("KAZ")){
            System.out.println(ct);
            if (ct.getName().equals("Almaty")){
               city = ct;
            }
        }
        System.out.println("FINDED CITY = "+city);
        User user = new User();
        user.setPassword(Validator.md5Apache("qwerty123"));
        user.setCity(city);
        user.setNickname("Mortel");
        user.setLastname("Almuhanov");
        user.setUser_name("Damir");
        user.setRole(role);
        UserDao userDao = new UserDao();
        String email = "lev@gmail.com";
        if(Validator.validateEmail(email)){
            user.setEmail(email);
            userDao.addUser(user);
            System.out.println(user);
        }
        else{
            System.out.println("Email has not validated");
        }

        System.out.println("validateEmail user: "+userDao.validate(user));
    }
}
