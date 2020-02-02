package pl.edu.wszib.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAOImpl implements IProductDAO {

    private List<Product> productsList = new ArrayList<>();

    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public ProductDAOImpl(SessionFactory hibernateSessionFactory) {
    }


    public void saveProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(product);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(product);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }



    @Override
    public List<Product> getAllProducts() {
        Session session = factory.openSession();

        List products = session
                .createQuery("FROM pl.edu.wszib.model.Product")
                .list();
        session.close();
        return products;
    }


    @Override
    public Product getProduct(int id){
        Session  session =factory.openSession();
        Product product =
                (Product) session.createQuery("FROM pl.edu.wszib.model.Product WHERE id = " + id).uniqueResult();
        session.close();
        return product;
    }

}
