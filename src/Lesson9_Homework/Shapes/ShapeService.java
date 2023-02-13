package Lesson9_Homework.Shapes;

import Lesson9_Homework.Exceptions.EntityNotFoundException;
import java.util.Collection;


public class ShapeService {
    
    private final ShapeRepository shapeRepository;

    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public Shape save(Shape shape){
        Shape savedShape = shapeRepository.save(shape);
        return savedShape;
    }

    public Collection<Shape> listShapes(){
        return shapeRepository.listShapes();
    }

    public Shape getShapeById(Integer id){
        return shapeRepository.getShapeById(id)
                .orElseThrow(() -> new EntityNotFoundException("Shape not found with id = " + id));

    }

}
