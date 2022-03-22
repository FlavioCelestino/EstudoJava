package exercicio_03.source.entities;

public class retangulo {

    public double width;
    public double height;

    public double area(){

        return width *height;

    }

    public double perimeter(){

        return width + height + width + height;
        
    }

    public double diagonal(){

        return Math.sqrt(width * width + height * height);
        
    }

}
