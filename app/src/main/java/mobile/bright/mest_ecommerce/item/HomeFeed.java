package mobile.bright.mest_ecommerce.item;


public class HomeFeed {
    private String tittle;
    private int imageResource;

    public HomeFeed(String tittle, int imageResource) {
        this.tittle = tittle;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTittle() {
        return tittle;
    }
}
