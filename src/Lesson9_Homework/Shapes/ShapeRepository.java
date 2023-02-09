package Lesson9_Homework.Shapes;

import java.util.HashMap;
import java.util.Map;

public class ShapeRepository {

    private static Integer idInteger = 0;
    private Map<Integer, Shape> repository = new HashMap<>();

    public Shape save(Shape shape){
        repository.put(idInteger, shape);
        idInteger++;
        return shape;
    }

    


    
}
