package xcale.tecnico.nicolasromero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;

    private String createdBy;

    private Timestamp createdDate;

    public Message() {

    }

}
