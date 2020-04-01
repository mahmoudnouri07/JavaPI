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
public class Tickets {
    private Integer id;
    private String nomPlat;
    private String photoPlat;
    private Date date;
    private Integer id_user;
    
    
public Tickets(){
}


public Tickets(Integer id,String nomPlat, String photoPlat,Date date,Integer id_user){
    
    this.id=id;
    this.date=date;
    this.nomPlat=nomPlat;
    this.photoPlat=photoPlat;
    this.id_user=id_user;
    
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Tickets{" + "id=" + id + ", nomPlat=" + nomPlat + ", photoPlat=" + photoPlat + ", date=" + date + ", id_user=" + id_user + '}';
    }


}


