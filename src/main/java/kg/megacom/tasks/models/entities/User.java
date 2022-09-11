package kg.megacom.tasks.models.entities;


import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "users")
public class User {

    @Id
            @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    String name;
}
