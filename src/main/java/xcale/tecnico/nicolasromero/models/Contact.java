package xcale.tecnico.nicolasromero.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Contact {

    @Id
    private String phone;

    private String firstname;

    private String lastname;

    private Timestamp createdDate;

}
