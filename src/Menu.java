public class Menu {
    private boolean newItem;
    private String description;
    private String category;
    private double price;

    public Menu(boolean newItem, String description, String category, double price){
        super();
        this.newItem = newItem;
        this.description = description;
        this.category = category;
        this.price = price;
    }


    public boolean isNew() {
        return newItem;
    };

    public void setNewItem(boolean aIsNew) {
        newItem = aIsNew;
    };

    public void setDescription(String aDescription){
        description = aDescription;
    }

    public String getDescription(){
        return description;
    };

    public void setCategory(String aCategory){
        category = aCategory;
    };

    public String getCategory(){
        return category;
    };

    public void setPrice(double aPrice){
        price = aPrice;
    }

    public double getPrice(){
        return price;
    }




}


