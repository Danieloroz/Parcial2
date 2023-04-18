package Problema2.repository;

import Problema2.ObjectSerializer;
import Problema2.model.Mall;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MallListRepository implements CrudRepository{

    private List<Mall> dataSource;

    public MallListRepository() throws IOException, ClassNotFoundException{
        this.dataSource = new ArrayList<>();
    }
    @Override
    public List<Mall> list() {
        return dataSource;
    }
    @Override
    public Mall byId(Integer id) {
        return dataSource.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
        }

    @Override
    public void create(Mall mall) throws IOException {
        this.dataSource.add(mall);
        ObjectSerializer.writeObjectToFile(dataSource, "dataSource.ax");
    }

    @Override
    public void edit(Mall mall) throws IOException{
        Mall m = this.byId(mall.getId());
        m.setMallName(mall.getMallName());
        m.setCity(mall.getCity());
        m.setDirection(mall.getDirection());
    }

    @Override
    public void delete(Integer id) throws IOException {
        this.dataSource.remove(this.byId(id));
        ObjectSerializer.writeObjectToFile(dataSource, "dataSource.ax");
    }
    @Override
    public int getByID(Integer id) throws IOException{
        return this.dataSource.size();
    }
}
