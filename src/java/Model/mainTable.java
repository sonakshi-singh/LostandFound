package Model;

public class mainTable 
{
   String uniqueId, name, lostItem, location , details, date,status;
  
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.name = uniqueId;
    }
    
    public String getSatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public String getLostItem() {
        return lostItem;
    }

    public void setLostItem(String lostItem) {
        this.lostItem = lostItem;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
     public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.details = date;
    }

} 