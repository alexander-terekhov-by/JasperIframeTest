package com.test.jasperiframetest.dao;

import com.test.jasperiframetest.entity.Role;
import com.test.jasperiframetest.entity.User;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class UserDao {

    @Autowired
    SessionFactory sessionFactory;

    public User getByLogin(String login) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login));
        return (User) criteria.uniqueResult();
    }
}
