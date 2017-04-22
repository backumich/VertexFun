package ua.com.vertex.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Singleton;

@Data
@AllArgsConstructor
@Singleton
public class MyClass {

    private Integer id;
    private String name;
    private String secondName;

    public interface SuperSecret {
    }

}
