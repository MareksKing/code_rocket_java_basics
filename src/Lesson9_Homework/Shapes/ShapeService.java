package Lesson9_Homework.Shapes;

public class ShapeService {
    
    private final ShapeRepository shapeRepository;

    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public Shape save(Shape shape){
        Shape savedShape = shapeRepository.save(shape);
        return savedShape;
    }


}
