package Creational.Prototype;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class MLModel implements ObjectClonable{

    private ModelType type;
    private String description;
    private double trainingSplit;
    private double validationSplit;
    private double alpha;
    private double test;

    // Step 2: implement clone method;
    public MLModel clone() {
        return new MLModel(type, description, trainingSplit, validationSplit, alpha, test);
    }
}
