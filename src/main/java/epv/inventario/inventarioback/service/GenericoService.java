package epv.inventario.inventarioback.service;

import java.util.List;
import java.util.Optional;

public interface GenericoService<T, ID> {

    public List<T> listar();
    public <S extends T> S guardar(S entity);
    void eliminar(T entity);
    void eliminarPorId(ID id);
    public T buscarPorId(ID id);





}
