/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author diegotxr
 */

public class HibernateUtil {

    private static EntityManagerFactory entFactory;
    private static HibernateUtil util;

    private HibernateUtil() {
        entFactory = Persistence.createEntityManagerFactory("ProjetoBD");
    }

    public static HibernateUtil getInstance() {
        if (util == null) {
            util = new HibernateUtil();
        }
        return util;
    }

    public EntityManagerFactory getFactory() {
        return entFactory;
    }
}
