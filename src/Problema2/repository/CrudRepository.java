package Problema2.repository;

import Problema2.model.Mall;

import java.io.IOException;
import java.util.List;

public interface CrudRepository {
    List<Mall> list() throws IOException, ClassNotFoundException;
    ;
    Mall byId(Integer id) throws IOException;
    void create(Mall mall) throws IOException;
    void edit(Mall mall) throws IOException;
    void delete(Integer id) throws IOException;
    public int getByID(Integer id) throws IOException;
}
