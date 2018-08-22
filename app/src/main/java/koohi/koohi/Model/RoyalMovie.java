package koohi.koohi.Model;



public class RoyalMovie {
    String name;
    int ImageView1;
    int ImageView2;
    int ImageView3;
    int ImageView4;

    public RoyalMovie(String name, int imageView1, int imageView2, int imageView3, int imageView4) {
        this.name = name;
        ImageView1 = imageView1;
        ImageView2 = imageView2;
        ImageView3 = imageView3;
        ImageView4 = imageView4;
    }

    public RoyalMovie(String name, String s, String s1, String s2, String s3) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageView1() {
        return ImageView1;
    }

    public void setImageView1(int imageView1) {
        ImageView1 = imageView1;
    }

    public int getImageView2() {
        return ImageView2;
    }

    public void setImageView2(int imageView2) {
        ImageView2 = imageView2;
    }

    public int getImageView3() {
        return ImageView3;
    }

    public void setImageView3(int imageView3) {
        ImageView3 = imageView3;
    }

    public int getImageView4() {
        return ImageView4;
    }

    public void setImageView4(int imageView4) {
        ImageView4 = imageView4;
    }
}
