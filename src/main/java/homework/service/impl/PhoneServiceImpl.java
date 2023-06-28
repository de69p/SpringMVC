package homework.service.impl;

import homework.dao.CrudDao;
import homework.domain.Phone;
import homework.service.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PhoneServiceImpl implements CrudService<Phone> {

    private CrudDao<Phone> dao;

    @Override
    public void add(Phone entity) {
        dao.add(entity);
    }

    @Override
    public Phone findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public List<Phone> findAll() {
        return dao.findAll();
    }

    @Override
    public void update(Phone entity) {
        dao.update(entity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }
}
