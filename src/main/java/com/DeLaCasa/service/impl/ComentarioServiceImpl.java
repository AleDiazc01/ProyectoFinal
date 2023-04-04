package com.DeLaCasa.service.impl;

import com.DeLaCasa.domain.Comentario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.DeLaCasa.dao.ComentarioDao;
import com.DeLaCasa.service.ComentarioService;


public class ComentarioServiceImpl implements ComentarioService{
    @Autowired
    private ComentarioDao comentarioDao;

    @Transactional(readOnly = true)
    public List<Comentario> getComentario() {
        return comentarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Comentario getComentario(Comentario comentario) {
        return comentarioDao.findById(comentario.getIdComentario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Comentario comentario) {
        comentarioDao.save(comentario);
    }

    @Override
    @Transactional
    public void delete(Comentario comentario) {
        comentarioDao.delete(comentario);
    }

}