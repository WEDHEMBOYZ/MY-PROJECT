public class Shape {
    public double length;
    public double width;
    public double height;
    public double volume;

    public Shape(double length,double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
        calculateVolume();
    }

    public double compareTo(Shape shape) {
        return Math.abs(this.volume - shape.volume);
    }

    public void calculateVolume() {
        this.volume = length * width * height;
    }
    

    public void cetak() {
        System.out.println("Panjang x Lebar x Tinggi = " + length + " x " + width + " x " + height);
        System.out.println("Volume = " + volume);
    }

}
