package homework.dao.impl;

import homework.dao.CrudDao;
import homework.domain.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements CrudDao<Student> {

    @PersistenceContext
    EntityManager em;

    @Override
    public void add(Student entity) {
        em.persist(entity);
    }

    @Override
    public Student findById(Integer id) {
        return em.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return em.createQuery("FROM Student s", Student.class).getResultList();
    }

    @Override
    public void update(Student entity) {
        Student merge = em.merge(entity);
        em.persist(merge);
    }

    @Override
    public void delete(Integer id) {
        Query query = em.createQuery("FROM Student s WHERE s.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
