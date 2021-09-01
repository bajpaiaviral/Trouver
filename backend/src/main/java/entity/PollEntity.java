package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="Book")
@Data
@NoArgsConstructor
public class PollEntity {

    @Id
    @Column(name="pollId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pollId;


    private int userId;

    @Column(name="createdAt")
    private Timestamp createdAt;

    @Column(name="modifiedAt")
    private Timestamp modifiedAt;

    @Column(name="question")
    private String question;

    @Column(name="pollType")
    private String pollType;

    @Column(name="options")
    private String options;

    @Column(name="customExpiry")
    private Timestamp customExpiry;

    @Column(name="isActive")
    private boolean isActive;

    @Column(name="url")
    private String url;

    @Column(name="voteShare")
    private String voteShare;

    @Column(name="tags")
    private String tags;

}
