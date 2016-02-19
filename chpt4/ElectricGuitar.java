// this is an example of using getters and setters

class ElectricGuitar {
    String brand;

    String getBrand(){  // only thing needed to do is return the requested
        return brand;            // instance variable
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }
}
