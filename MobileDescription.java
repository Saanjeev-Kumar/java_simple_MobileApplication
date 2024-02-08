package pro1;

public class MobileDescription {
private long id;
private long model;
private int price;
private String date;
public MobileDescription() {
super();
}
public MobileDescription(long id, long model, int price, String date) {
super();
this.id = id;
this.model = model;
this.price = price;
this.date = date;
}
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public long getModel() {
return model;
}
public void setModel(long model) {
this.model = model;
}
public int getPrice() {
return price;
}
public void setPrice(int price) {
this.price = price;
}
public String getDate() {
return date;
}
public void setDate(String date) {
this.date = date;
}

}
