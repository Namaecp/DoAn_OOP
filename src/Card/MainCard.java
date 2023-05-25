/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;


import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class MainCard {

  
    public int IDCard;
    public String title; 
    private String description;
    private Date dueDate;
    private  List<Label> labels; 
    private  List<Attachment> attachments; 
    private List<Comment> comments; 
     private boolean archived;

  public MainCard(int IDCard, String title, String description, Date dueDate, List<Label> labels, List<Attachment> attachments, List<Comment> comments, boolean archived) {
        this.IDCard = IDCard;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
            this.labels = labels;
        this.attachments = attachments;
        this.comments = comments;
        this.archived = archived;
    }
     public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

     public void addLabel(Label label) {
      this.labels.add(label);
   }

    public void removeLabel(Label label) {
      this.labels.remove(label);
   }

    public List<Label> getLabels() {
      return labels;
   }

    public List<Attachment> getAttachments() {
      return attachments;
   }
   
   public void addAttachment(Attachment attachment) {
      this.attachments.add(attachment);
   }
   
   public void removeAttachment(Attachment attachment) {
      this.attachments.remove(attachment);
   }

    public List<Comment> getComments() {
      return comments;
   }
   
   public void addComment(Comment comment) {
      this.comments.add(comment);
   }
   
   public void removeComment(Comment comment) {
      this.comments.remove(comment);
   }

    public boolean isArchived() {
        return archived;
    }
    
    public void archive() {
        archived = true;
    }
    
    public void unarchive() {
        archived = false;
    }

}

