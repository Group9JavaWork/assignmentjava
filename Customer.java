class Customer  extends branch{
    private String cname;
    private String location;
    private String contactinf;
    private String username;
    private String password;
   public Customer(String cname, String location, String contactinf) {
     this.cname = cname;
     this.location = location;
     this.contactinf = contactinf;
   }
   //second constructor 
   Customer(){
 
   }
   public String getCname() {
     return cname;
   }
   public void setCname(String cname) {
     this.cname = cname;
   }
   public String getLocation() {
     return location;
   }
   public void setLocation(String location) {
     this.location = location;
   }
   public String getContactinf() {
     return contactinf;
   }
   public void setContactinf(String contactinf) {
     this.contactinf = contactinf;
  
 }
   public String getUsername() {
     return username;
   }
   public void setUsername(String username) {
     this.username = "davidniyonkuru";
   }
   public String getPassword() {
     return password;
   }
   public void setPassword(String password) {
     this.password = "1234";
   }
  }
 