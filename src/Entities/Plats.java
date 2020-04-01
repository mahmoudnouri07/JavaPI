/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author mahmoud ennouri
 */
public class Plats {
    private Integer id;
    private String nomPlat;
    private String photoPlat;
    private String description;
    private Date date; 
    
  
    public Plats(){
        
   }
   
     public Plats(Integer id,String nomPlat,String photoPlat,String description,Date date ){
         this.id=id;
         this.nomPlat=nomPlat;
         this.photoPlat=photoPlat;
         this.description=description;
         this.date=date;
     }
     
     public Plats(String nomPlat,String photoPlat,String description,Date date ){
         this.nomPlat=nomPlat;
         this.photoPlat=photoPlat;
         this.description=description;
         this.date=date;
     }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomPlat() {
        return nomPlat;
    }

    public void setNomPlat(String nomPlat) {
        this.nomPlat = nomPlat;
    }

    public String getPhotoPlat() {
        return photoPlat;
    }

    public void setPhotoPlat(String photoPlat) {
        this.photoPlat = photoPlat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Plats{" + "id=" + id + ", nomPlat=" + nomPlat + ", photoPlat=" + photoPlat + ", description=" + description + ", date=" + date + '}';
    }
     
     
     
}
