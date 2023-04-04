package com.DeLaCasa.service;

/**
 *
 * @author alejadro
 */
import com.DeLaCasa.domain.Comentario;
import java.util.List;

public interface ComentarioService {
    
    public List<Comentario> getComentario();
    
    public Comentario getComentario(Comentario comentario);
    
    public void save(Comentario comentario);
    
    public void delete(Comentario comentario);
}
