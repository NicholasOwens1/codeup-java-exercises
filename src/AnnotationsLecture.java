import jdk.jfr.Description;
import jdk.jfr.Experimental;
import jdk.jfr.Label;
import jdk.jfr.Name;

public class AnnotationsLecture {
//      TODO Annotate a property
    @Experimental
    public String name;
//  TODO Annotate a method
    @Name("name")
    public String getName() {
        return name;
    }
//  TODO Annotate a parameter
    public String setName(String name){
        return this.name = name;
    }

// TODO Annotate a local variable

// @Entity("thisEntity")
}
