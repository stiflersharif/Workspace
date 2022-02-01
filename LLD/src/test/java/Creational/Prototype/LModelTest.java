package Creational.Prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LModelTest {
    private ModelRegistry registry = null;
    @Before
    public void setUp() {

        registry = new ModelRegistry();

        registry.registerModel(new MLModel(ModelType.LR, "Linear Regression", 0.8, 0.2, 0.1, 0.9));
        registry.registerModel(new MLModel(ModelType.SVM, "Support Vector Machine", 0.8, 0.2, 0.1, 0.9));
        registry.registerModel(new MLModel(ModelType.DT, "Decision Tree", 0.8, 0.2, 0.1, 0.9));
    }

    // teardown

    @Test
    public void testModelCreation(){
        MLModel model = new MLModel(ModelType.LR,"Desc", 0.7,0.3,0.1,0.2);
        Assert.assertEquals("If name is set it should v equal to LR","LR", model.getType().name());
    }

    @Test
    public void testModelCloning(){
        MLModel model = new MLModel(ModelType.LR,"Desc", 0.7,0.3,0.1,0.2);
        MLModel cloneModel = model.clone();
        Assert.assertEquals("If name is set it should v equal to LR","LR", cloneModel.getType().name());
        Assert.assertFalse("If a clone is called a new copy should v created",cloneModel == model);
    }
// clone model using prototype.
    @Test
    public  void testMultipleClone(){
        MLModel prototype = new MLModel(ModelType.LR,"Desc", 0.7,0.3,0.1,0.2);
        List<MLModel> models = new ArrayList<>();
        for(int i=1;i<=10;i++){
            MLModel cloneModel = prototype.clone();
            cloneModel.setAlpha(prototype.getAlpha()*i);
            cloneModel.setTest(i/prototype.getTest());
            models.add(cloneModel);
        }
    }

    @Test
    public void testRegistry() {
        MLModel model = registry.getModel(ModelType.LR);
        Assert.assertNotNull("If model is populated, it should not be null", model);
    }
    @Test
    public void createUsingRegistry() {

        // Create first prototype
        MLModel prototype1 = new MLModel(ModelType.LR, "description1", 0.7, 0.3, 0.1, 0.2);

        // Populate registry
        ModelRegistry registry = new ModelRegistry();
        registry.registerModel(prototype1);

        MLModel prototype2 = new MLModel(ModelType.SVM, "description2", 0.7, 0.3, 0.1, 0.2);
        registry.registerModel(prototype2);

        List<MLModel> models = new ArrayList<>();

        // Create multiple models of type 1
        for (int i = 0; i < 10; i++) {
            MLModel clonedModel = prototype1.clone();
            clonedModel.setAlpha(prototype1.getAlpha() * i);
            clonedModel.setTest(i / prototype1.getTest());
            models.add(clonedModel);
        }

        // Create multiple models of type 2
        for (int i = 0; i < 10; i++) {
            MLModel clonedModel = prototype2.clone();
            clonedModel.setAlpha(prototype2.getAlpha() * i);
            clonedModel.setTest(i / prototype2.getTest());
            models.add(clonedModel);
        }
    }


}
