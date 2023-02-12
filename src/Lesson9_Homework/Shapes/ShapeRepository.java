package Lesson9_Homework.Shapes;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ShapeRepository {

    private static Integer idInteger = 0;
    private Map<Integer, Shape> repository = new HashMap<>();

    public Shape save(Shape shape){
        repository.put(idInteger, shape);
        idInteger++;
        return shape;
    }

    public Optional<Shape> getShapeById(Integer id){
        return Optional.ofNullable(repository.get(id));
    }

    public Collection<Shape> listShapes(){
        return repository.values();
    }

    


    
}
