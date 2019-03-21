package com.model;
 
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostRemove;
 
@Entity
public class BDDCOMMENTS {
 /*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;
 */
    @Column(name="DATE")
    private String date;
    
    @Column(name="COMMENT")
    private String comment;
 
    public String getDate() {
        return date;
    }
    public void setDate(String d) {
        this.date = d;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String c) {
        this.comment = c;
    }
 
    @Override
    public String toString() {
        return "BDDCOMMENTS :\tdate=" + date + "\tcomment=" + comment + "\n";
    }
}
